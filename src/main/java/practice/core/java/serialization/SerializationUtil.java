package practice.core.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtil {
	
	public static void serializeObject(Object obj, String fileName) throws IOException{
		
		FileOutputStream fs;
			fs = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fs);
			oos.writeObject(obj);
			oos.close();
	}
	
	public static Object deserializeObject(String fileName) throws IOException, ClassNotFoundException{
		FileInputStream fs = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fs);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}

}

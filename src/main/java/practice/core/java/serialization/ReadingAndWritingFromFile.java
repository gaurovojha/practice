package practice.core.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingAndWritingFromFile {

	static Map<String, Integer> shareMap = new HashMap<String, Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> shareData = new ArrayList<String>();
		shareData.add("MS@100");
		shareData.add("GOOGLE@100");
		shareData.add("APPLE@100");
		shareData.add("UHG@100");
		shareData.add("GOOGLE@-100");
		shareData.add("APPLE@100");
		shareData.add("UHG@-100");
		shareData.add("UHG@-200");
		shareData.add("MS@-100");
		
		
		/*shareMap.put("MS",100);
		shareMap.put("GOOGLE",100);
		shareMap.put("APPLE",100);
		shareMap.put("UHG",100);
		shareMap.put("GOOGLE",-100);
		shareMap.put("APPLE",100);
		shareMap.put("UHG",-100);
		shareMap.put("UHG",-200);
		shareMap.put("MS",-100);*/
		
		
		//writing it to the file
		//writeToFile(shareData);
		
		//reading from the file
		//read
		
		//find share of a particular company
		System.out.println(findShares("MS", shareData,shareMap));
	}

/*	public static void writeToFile(List<String> shareData) {

		try {
			FileOutputStream fs = new FileOutputStream("test_file.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			// os.writeObject(arg0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readFromFile(){
		
		try {
			FileInputStream fs = new FileInputStream("test_file.txt");
			ObjectInputStream os = new ObjectInputStream(fs);
			//os.readC;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

	public static int findShares(String companyName, List<String> shareData, Map<String, Integer> companyMap) {
		for(int i=0 ; i<shareData.size();i++){
			System.out.println(shareData.get(i));
			String[] str = shareData.get(i).split("@");
			System.out.println(str);
			for(int j = 0 ; j <str.length ; j++){
				if(companyMap.containsKey(companyName)){
					companyMap.put(companyName,companyMap.get(companyName) + Integer.parseInt(str[i+1]));
				}else
					companyMap.put(str[i], Integer.parseInt(str[i+1]));
				}
			}
		return companyMap.get(companyName);
		}
	}

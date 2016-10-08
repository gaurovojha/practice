package practice.core.java.designpattern.iodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {

		int c ;
		try {
			InputStream in = new LowerCaseInputStream(
					new BufferedInputStream(new FileInputStream("C://testing1.txt")));
			while((c = in.read())>0){
				System.out.print((char)c);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

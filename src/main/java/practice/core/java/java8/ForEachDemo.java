package practice.core.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	static List<Integer> values = new ArrayList<Integer>();
	//Consumer c
	public static void main(String[] args) {
		values.add(1001);
		values.add(1002);
		values.add(1003);
		values.add(1004);
		values.add(1005);
		values.add(1006);
		
		/*Consumer<Integer> c = i -> System.out.println(i);
		//values.forEach(i -> System.out.println(i)); //-> is LAMDA
		values.forEach(c);*/
		
		
		values.forEach(i -> System.out.println(i));
		System.out.println(values.stream().findFirst());

	}

}

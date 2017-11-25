package practice.core.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	static List<Integer> values = new ArrayList<Integer>();

	// Consumer c
	public static void main(String[] args) {
		values.add(1001);
		values.add(1002);
		values.add(1003);
		values.add(1004);
		values.add(1005);
		values.add(1006);

		/*
		 * Consumer<Integer> c = i -> System.out.println(i); //values.forEach(i
		 * -> System.out.println(i)); //-> is LAMDA values.forEach(c);
		 */

		values.forEach(i -> System.out.println(i));
		System.out.println(values.stream().findFirst());

		// creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);
		
		MyConsumer myConsumer = new MyConsumer();
		myList.forEach(myConsumer);

	}
}

class MyConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("performing business logic");

	}

}
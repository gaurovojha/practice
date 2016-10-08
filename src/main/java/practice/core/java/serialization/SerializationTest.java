package practice.core.java.serialization;

import java.io.IOException;

public class SerializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee p = new Employee("Gaurov",100,500000, new Person());
		//Employee p = new Employee("Gaurov",100,500000, new Address());
		Employee p = new Employee("Gaurov",100,500000);
		SerializationUtil sUtil = new SerializationUtil();
		try {
			sUtil.serializeObject(p, "employee.ser");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Employee newEmpl = null;
		try {
			newEmpl = (Employee)sUtil.deserializeObject("employee.ser");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("" + p);
		//System.out.println("" + p.temp);
		System.out.println("" + newEmpl);
		

	}

}

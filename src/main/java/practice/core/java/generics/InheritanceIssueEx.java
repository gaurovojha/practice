package practice.core.java.generics;

import java.util.ArrayList;
import java.util.List;

public class InheritanceIssueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] employees = new Employee[10];
		Person[] managers = new Manager[10];
		
		employees[1] = new Manager();
		
		/*
		 * This is an invalid scenario as the whole point of generics is to provide type safety
		 */
		//List<Person> personList = new ArrayList<Employee>();

	}

}

class Person{}

class Employee extends Person{}

class Manager extends Person{}

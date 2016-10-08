package practice.core.java.serialization;

import java.io.Serializable;

public class Employee extends Person  implements IPerson , Serializable{
	
//	private static final long serialVersionUID = -6470090944414208496L;
	private String name;
	private int id;
	transient private int salary;
	private Person p ;
	private Address a ;
//	private String password;
	
	@Override
	public String toString(){
		return "Employee{name="+name+",id="+id+",salary="+salary+"}";
	}

	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.temp1 = 2000;
	}
	
	public Employee(String name, int id, int salary, Address a) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.p = p;
		this.a = a;
	}
	public Employee(String name, int id, int salary, Person p) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.p = p;
		this.a = a;
	}
	
	/*
	 * Getters and Setters
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/*public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}*/
	
}

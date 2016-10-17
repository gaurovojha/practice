package practice.core.java.oops;

interface Interface1{
	
	int i  = 10;
	void printValue();
}

interface  Interface2{
	
	int i = 10;
	void printValue();
	
}

class SuperClass{
	int i = 20;
	
	public void printValue() {
		System.out.println("inside printvalue implementation of super class");
	}
}

public class TwoInterfaceDiamondProblem extends SuperClass implements Interface1 , Interface2{
	
	int i = 30;
	public static void main(String args[]){
		TwoInterfaceDiamondProblem ac= new TwoInterfaceDiamondProblem();
		SuperClass i1 = ac;
		i1.printValue();
		ac.printValue();
		System.out.println("value of i is : " + ac.i);
	}

	public void printValue() {
		System.out.println("inside printvalue implementation of subclass");
	}

}

package practice.core.java.oops;

interface Interface1{
	
	void printValue();
}

interface  Interface2{
	
	void printValue();
	
}

class SuperClass{
	public void printValue() {
		System.out.println("inside printvalue implementation of super class");
	}
}

public class TwoInterfaceDiamondProblem extends SuperClass implements Interface1 , Interface2{
	
	public static void main(String args[]){
		TwoInterfaceDiamondProblem ac= new TwoInterfaceDiamondProblem();
		SuperClass i1 = ac;
		i1.printValue();
		ac.printValue();
	}

	public void printValue() {
		System.out.println("inside printvalue implementation of subclass");
	}

}

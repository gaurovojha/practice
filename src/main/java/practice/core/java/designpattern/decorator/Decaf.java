package practice.core.java.designpattern.decorator;

public class Decaf extends Beverage{

	public Decaf(){
		description = "Decaf";
	}
	
	@Override
	public Double cost() {
		return 1.05;
	}

}

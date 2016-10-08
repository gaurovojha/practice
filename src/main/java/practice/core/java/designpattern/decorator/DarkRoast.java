package practice.core.java.designpattern.decorator;

public class DarkRoast extends Beverage{

	
	public DarkRoast(){
		description = "Dark Roast";
	}
	
	@Override
	public Double cost() {
		return .99;
	}

}

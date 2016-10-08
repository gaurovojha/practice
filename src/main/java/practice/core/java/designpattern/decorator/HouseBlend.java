package practice.core.java.designpattern.decorator;

public class HouseBlend extends Beverage{

	public HouseBlend(){
		description = "House Blend";
	}
	
	@Override
	public Double cost() {
		return .89;
	}

}

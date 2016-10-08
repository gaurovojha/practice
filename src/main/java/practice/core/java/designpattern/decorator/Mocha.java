package practice.core.java.designpattern.decorator;

public class Mocha extends CondimentDecorator{

	private Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+ "," + "Mocha";
	}

	@Override
	public Double cost() {
		return .20 + beverage.cost();
	}

}

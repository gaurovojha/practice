package practice.core.java.designpattern.decorator;

public class Whip extends CondimentDecorator{
	
	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "," + "Whip";
	}

	@Override
	public Double cost() {
		return .10 + beverage.cost();
	}

}

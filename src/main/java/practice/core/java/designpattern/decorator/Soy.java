package practice.core.java.designpattern.decorator;

public class Soy extends CondimentDecorator {

	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "," + "Soy";
	}

	@Override
	public Double cost() {
		return .15 + beverage.cost();
	}

}

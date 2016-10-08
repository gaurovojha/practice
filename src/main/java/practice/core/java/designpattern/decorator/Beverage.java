package practice.core.java.designpattern.decorator;

/*
 * This is the class which was already present as abstract we could have made an interface as well
 */

public abstract class Beverage {

	String description = "unknown beverage";

	public String getDescription() {
		return this.description;
	}

	public abstract Double cost();

}

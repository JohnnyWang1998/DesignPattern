package starbuzzCoffee;

public abstract class CupDecorator extends Beverage {
	protected Beverage _beverage;
	public String getDescription() {
		return _description;
	}
}

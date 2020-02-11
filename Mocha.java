package starbuzzCoffee;

public class Mocha extends CodimentDecorator {
	protected Beverage _beverage;
	
	public Mocha(Beverage beverage) {
		_beverage = beverage;
	}
	
	public float cost() {
		return _beverage.cost() + 0.20f;
	}
	
	public String getDescription() {
		return _beverage.getDescription() + ", Mocha";
	}
}

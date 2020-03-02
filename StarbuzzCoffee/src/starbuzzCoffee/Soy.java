package starbuzzCoffee;

public class Soy extends CodimentDecorator {
	protected Beverage _beverage;
	
	public Soy(Beverage beverage) {
		_beverage = beverage;
	}
	public float cost() {
		return _beverage.cost() + 0.15f;
	}
	public String getDescription() {
		return _beverage.getDescription() + ", Soy";
	}
}

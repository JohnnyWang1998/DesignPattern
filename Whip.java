package starbuzzCoffee;

public class Whip extends CodimentDecorator{
	protected Beverage _beverage;
	
	public Whip(Beverage beverage) {
		_beverage = beverage;
	}
	public float cost() {
		return _beverage.cost() + 0.10f;
	}
	public String getDescription() {
		return _beverage.getDescription() + ", Whip";
	}
}

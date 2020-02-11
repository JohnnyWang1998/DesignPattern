package starbuzzCoffee;

public class Tall extends CupDecorator{
	
	//Here I set the size as tall
	public Tall(Beverage beverage) {
		_beverage = beverage;
		this.size = tall;
	}
	public float cost() {
		return _beverage.cost() + 0 ;//Cup is tall as default
	}
	public String getDescription() {
		return _beverage.getDescription();
	}
}

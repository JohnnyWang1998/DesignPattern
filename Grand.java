package starbuzzCoffee;

public class Grand extends CupDecorator{

	//Here I set the size as grand
	public Grand(Beverage beverage) {
		_beverage = beverage;
		this.size = grand;
	}
	public float cost() {
		return _beverage.cost()+0.20f;
	}
	public String getDescription() {
		return _beverage.getDescription();
	}
}

package starbuzzCoffee;

public class Venti extends CupDecorator {

	//Here I set the size as venti
	public Venti(Beverage beverage) {
		_beverage = beverage;
		this.size = venti;
	}
	public float cost() {
		return _beverage.cost() + 0.40f;
	}
	public String getDescription() {
		return _beverage.getDescription();
	}
}

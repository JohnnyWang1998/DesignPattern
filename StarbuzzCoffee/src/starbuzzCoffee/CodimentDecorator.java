package starbuzzCoffee;
//This is also a decorator to decorate Beverage like CodimentDecorator
public abstract class CodimentDecorator extends Beverage {
	public String getDescription() {
		return _description;
	}	
}

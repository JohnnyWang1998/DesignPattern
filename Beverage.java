package starbuzzCoffee;

public abstract class Beverage {
	//The size is also a property of a coffee like description
	protected static final String tall = "Tall";
	protected static final String grand = "Grand";
	protected static final String venti = "Venti";
	//Set size default value as tall
	protected String size = tall;
	protected String _description;
	
	public String getDescription() {
		return _description;
	}
	//I create a method to get the size
	public String getSize() {
		return size;
	}
	public abstract float cost();
}

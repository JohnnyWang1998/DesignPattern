package menu;

public class MenuItem {
	private String _name = null;
	private String _description = null;
	private boolean _vegetarian;
	private double _price;
	public MenuItem(String name, String description, boolean vegetarian, double price){
			_name = name;
			_description = description;
			_vegetarian = vegetarian;
			_price = price;
		}

		public String getName() {
			return _name;
		}

		public String getDescription() {
			return _description;
		}

		public double getPrice() {
			return _price;
		}

		public boolean isVegetarian() {
			return _vegetarian;
		}
}

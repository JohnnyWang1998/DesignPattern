package menu;

public class CafeMenu implements Menu{
	private static final int MAX_ITEMS = 128;
	private MenuItem[] _menu;
	private int _nItems;
	private String time = "Breakfast";
	
	public CafeMenu() {
		_nItems = 0;
		_menu = new MenuItem[MAX_ITEMS];
		addItem("HouseBlend", "(Fakin\') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("Decafe", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("DarkRoast", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Espresso", "A hot dog, with saukraut, relish, onions, topped with cheese", false, 3.05);
		addItem("Milk", "Conditemt", false, 0.55);
		addItem("Mocha", "Conditemt", false, 0.49);
		addItem("Soy", "Conditemt", false, 0.39);
		addItem("Whip", "Conditemt", false, 0.69);
	}
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		if (_nItems >= MAX_ITEMS) {
			System.out.println("Sorry, no more menu item is allowed due to the limited space\n");
		}
		else {
			_menu[_nItems] = item;
			_nItems++;
		}
	}
	public Iterator createIterator() {
		return new CafeMenuIterator(_menu, _nItems);
	}
	public int getNItems() {
		return _nItems;
	}
	public String getTime() {
		return time;
	}
	
}

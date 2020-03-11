package menu;

import java.util.ArrayList;

public class DinnerMenu implements Menu {
	private ArrayList<MenuItem> _menu;
	private String time = "Dinner";
	
	public DinnerMenu() {
		_menu = new ArrayList<MenuItem>();
		addItem("Vegetarian BLT", "(Fakin\') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT       ", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog     ", "A hot dog, with saukraut, relish, onions, topped with cheese", false, 3.05);
	}
	public void addItem(String name, String description, boolean vegetarian, double price) {
			MenuItem  item = new MenuItem(name, description, vegetarian, price);
			_menu.add(item);
	}
	public Iterator createIterator() {
		return new DinnerMenuIterator(_menu);
	}
	public int getNItems() {
		return _menu.size();
	}
	public String getTime() {
		return time;
	}
}

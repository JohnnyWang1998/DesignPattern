package menu;

import java.util.Vector;

public class PancakeHouseMenu implements Menu {
	private Vector<MenuItem> _menu;
	private String time = "Lunch";
	public PancakeHouseMenu() {
		_menu = new Vector<MenuItem>();
		addItem("K&B\'s Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		addItem("Waffles         ", "Waffles, with your choice of blueberries of strawberries", true, 3.59);
	}
	public void addItem(String name, String description, boolean vegetarian, double price) {
			MenuItem  item = new MenuItem(name, description, vegetarian, price);
			_menu.add(item);
	}
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(_menu);
	}
	public int getNItems() {
		return _menu.size();
	}
	public String getTime() {
		return time;
	}
}

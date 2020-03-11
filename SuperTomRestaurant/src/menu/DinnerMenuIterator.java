package menu;

import java.util.ArrayList;

public class DinnerMenuIterator implements Iterator{
	
	private ArrayList<MenuItem> _menu;
	private int _pos;
	
	public DinnerMenuIterator(ArrayList<MenuItem> menu) {
		_menu = menu;
		_pos = 0;
	}
	public boolean hasNext() {
		return _pos < _menu.size();
	}
	public MenuItem next() {
		MenuItem item = _menu.get(_pos);
		_pos += 1;
		return item;
	}
}

package menu;

import java.util.Vector;

public class PancakeHouseMenuIterator implements Iterator{
	private Vector<MenuItem> _menu;
	private int _pos;
	
	public PancakeHouseMenuIterator(Vector<MenuItem> menu) {
		_menu = menu;
		_pos = 0;
	}
	public boolean hasNext() {
		return _pos < _menu.size();
	}
	public MenuItem next() {
		MenuItem item = _menu.elementAt(_pos);
		_pos += 1;
		return item;
	}
}

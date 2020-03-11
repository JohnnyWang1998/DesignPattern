package menu;

public class CafeMenuIterator implements Iterator{
	private MenuItem[] _menu;
	private int _size;
	private int _pos;
	
	public CafeMenuIterator(MenuItem[] menu, int size) {
		_menu = menu;
		_size = size;
		_pos = 0;
	}
	public boolean hasNext() {
		return _pos < _size;
	}
	public MenuItem next() {
		MenuItem item = _menu[_pos];
		_pos += 1;
		return item;
	}
}

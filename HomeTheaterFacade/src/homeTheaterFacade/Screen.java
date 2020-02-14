package homeTheaterFacade;

public class Screen {
	private String _name;
	public Screen(String name) {
		_name = name;
	}
	public void up() {
		System.out.println(_name + " up");
	}
	public void down() {
		System.out.println(_name + " down");
	}
	@Override
	public String toString() {
		return _name;
	}
}

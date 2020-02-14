package homeTheaterFacade;

public class PopcornPopper {
	private String _name;
	public PopcornPopper(String name) {
		_name = name;
	}
	public void on() {
		System.out.println(_name + " on");
	}
	public void off() {
		System.out.println(_name + " off");
	}
	public void pop() {
		System.out.println(_name + " popping popcorn");
	}
	@Override
	public String toString() {
		return _name;
	}
}

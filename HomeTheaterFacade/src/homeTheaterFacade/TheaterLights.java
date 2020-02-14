package homeTheaterFacade;

public class TheaterLights {
	private String _name;
	public TheaterLights(String name) {
		_name = name;
	}
	public void on() {
		System.out.println(_name + " on");
	}
	public void off() {
		System.out.println(_name + " off");
	}
	public void dim(int brightness) {
		System.out.println(_name + " dimming to " + brightness);
	}
	@Override
	public String toString() {
		return _name;
	}
}

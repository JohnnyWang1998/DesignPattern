package homeTheaterFacade;

public class Projecter {
	private String _name;
	private DvdPlayer _dvdPlayer;
	public Projecter(String name, DvdPlayer dvdPlayer) {
		_name = name;
		_dvdPlayer = dvdPlayer;
	}
	public void on() {
		System.out.println(_name + " on");
	}
	public void off() {
		System.out.println(_name + " off");
	}
	public void tvMode() {
		System.out.print(_name + " setting TV mode");
	}
	public void wideScreenMode() {
		System.out.println(_name + " setting wide screen mode");
	}
	@Override
	public String toString() {
		return _name;
	}
}

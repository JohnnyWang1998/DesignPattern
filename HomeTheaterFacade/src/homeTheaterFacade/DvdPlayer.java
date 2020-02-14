package homeTheaterFacade;

public class DvdPlayer {
	private String _name;
	private Amplifier _amplifier;
	public DvdPlayer(String name, Amplifier amplifier) {
		_name = name;
		_amplifier = amplifier;
	}
	public void on() {
		System.out.println(_name + " on");
	}
	public void off() {
		System.out.println(_name + " off");
	}
	public void eject() {
		System.out.println(_name + " eject");
	}
	public void pause() {
		System.out.println(_name + " pause");
	}
	public void play(String movie) {
		System.out.println(_name + " playing " + movie);
	}
	public void setSurroundAudio() {
		System.out.println(_name + " setting surround audio");
	}
	public void setTwoChannelAudio() {
		System.out.println(_name + " setting two channel audio");
	}
	public void stop() {
		System.out.println(_name + " stop");
	}
	@Override
	public String toString() {
		return _name;
	}
}

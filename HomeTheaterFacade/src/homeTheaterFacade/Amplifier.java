package homeTheaterFacade;

public class Amplifier {
	private Tuner _tuner;
	private DvdPlayer _dvdPlayer;
	private CdPlayer _cdPlayer;
	private String _name;
	public Amplifier(String name) {
		_name = name;
		_dvdPlayer = null;
		_cdPlayer = null;
		_tuner = null;
	}
	public void on() {
		System.out.println(_name + " on");
	}
	public void off() {
		System.out.println(_name + " off");
	}
	public void setCd(CdPlayer cdPlayer) {
		_cdPlayer = cdPlayer;
		System.out.println(_name + " setting CD player to " + _cdPlayer.toString());
	}
	public void setDvd(DvdPlayer dvdPlayer) {
		_dvdPlayer = dvdPlayer;
		System.out.println(_name + " setting DVD player  to " + _dvdPlayer.toString());
	}
	public void setStereoSound() {
		System.out.println(_name + " setting stereo sound mode");
	}
	public void setSurroundSound() {
		System.out.println(_name + " setting surround sound mode");
	}
	public void setTuner(Tuner tuner) {
		System.out.println(_name + " setting tuner to" + _dvdPlayer.toString());
	}
	public void setVolume(int volume) {
		System.out.println(_name + " setting volume to" + volume);
	}
	@Override
	public String toString() {
		return _name;
	}
}

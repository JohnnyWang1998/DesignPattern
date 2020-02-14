package homeTheaterFacade;

public class Tuner {
	private String _name;
	private Amplifier _amplifier;
	public Tuner(String name, Amplifier amplifier) {
		_name = name;
		_amplifier = amplifier;
	}
	public void on() {
		System.out.println(_name + " on");
	}
	public void off() {
		System.out.println(_name + " off");
	}
	public void setAm() {
		System.out.println(_name + " setting Am mode");
	}
	public void setFm() {
		System.out.println(_name + " setting Fm mode");
	}
	public void setFrequencey(float frequency) {
		System.out.println(_name + " setting frequency to " + frequency);
	}
	@Override
	public String toString() {
		return _name;
	}
}

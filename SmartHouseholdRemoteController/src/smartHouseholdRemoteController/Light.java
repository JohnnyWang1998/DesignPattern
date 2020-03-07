package smartHouseholdRemoteController;

public class Light {
	int brightness = 5;
	public void on() {
		System.out.println("\tLight is turned on...");
	}
	public void off() {
		System.out.println("\tLight is turned off...");
	}
	public void up() {
		System.out.println("\tLight is up to " + ++brightness + " level");
	}
	public void down() {
		System.out.println("\tLight is up to " + --brightness + " level");
	}
}

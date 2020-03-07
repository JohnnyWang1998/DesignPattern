package smartHouseholdRemoteController;

public class TV {
	int channel = 20;
	public void on() {
		System.out.println("\tTV is turned on...");
	}
	public void off() {
		System.out.println("\tTV is turned off...");
	}
	public void up() {
		System.out.println("\tThe TV channel is up to " + ++channel + " decibles");
	}
	public void down() {
		System.out.println("\tThe TV channel is up to " + --channel + " decibles");
	}
}

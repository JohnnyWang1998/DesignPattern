package smartHouseholdRemoteController;

public class SoundSystem {
	int volume = 50;
	public void on() {
		System.out.println("\tThe sound is turned on...");
	}
	public void off() {
		System.out.println("\tThe sound is turned off...");
	}
	public void up() {
		System.out.println("\tThe sound is up to " + ++volume + " decibles");
	}
	public void down() {
		System.out.println("\tThe sound is up to " + --volume + " decibles");
	}
}

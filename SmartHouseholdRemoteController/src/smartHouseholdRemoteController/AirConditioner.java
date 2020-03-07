package smartHouseholdRemoteController;

public class AirConditioner {
	int tem = 26;
	public void on() {
		System.out.println("\tAir conditioner is on...");
	}
	public void off() {
		System.out.println("\tAir conditioner is off...");
	}
	//I added the up and down method to up and down the data inside each applicance
	public void up() {
		System.out.println("\tAir conditioner is up to " + ++tem +" degrees");
	}
	public void down() {
		System.out.println("\tAir conditioner is down to " + --tem +" degrees");
	}
	//I added the set method to set corresponding value
	public void set(int value) {
		tem = value;
		System.out.println("\tAir conditioner is set to " + tem +" degrees");
	}
}

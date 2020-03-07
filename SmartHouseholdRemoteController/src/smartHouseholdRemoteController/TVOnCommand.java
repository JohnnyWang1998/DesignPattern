package smartHouseholdRemoteController;

public class TVOnCommand implements Command{
	private TV TV;
	
	public TVOnCommand(TV tv) {
		TV = tv;
	}
	public void execute() {
		System.out.println("Commanding the TV to turn on");
		TV.on();
	}
	public String getName() {
		return "TV ON";
	}
}

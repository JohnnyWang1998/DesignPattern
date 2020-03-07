package smartHouseholdRemoteController;

public class TVOffCommand implements Command{
	private TV TV;
	public TVOffCommand(TV tv) {
		TV = tv;
	}
	public void execute() {
		System.out.println("Commanding the TV to turn off");
		TV.off();
	}
	public String getName() {
		return "TV OFF";
	}	
}

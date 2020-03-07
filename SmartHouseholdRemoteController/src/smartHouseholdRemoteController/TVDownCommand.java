package smartHouseholdRemoteController;

public class TVDownCommand implements Command{
	private TV TV;
	public TVDownCommand(TV tv) {
		TV = tv;
	}
	public void execute() {
		System.out.println("Commanding the TV to turn down");
		TV.down();
	}
	public String getName() {
		return "TV DOWN";
	}
}

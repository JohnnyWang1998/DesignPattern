package smartHouseholdRemoteController;

public class TVUpCommand implements Command{
	private TV TV;
	public TVUpCommand(TV tv) {
		TV = tv;
	}
	public void execute() {
		System.out.println("Commanding the TV to turn up");
		TV.up();
	}
	public String getName() {
		return "TV UP";
	}
}

package smartHouseholdRemoteController;

public class AirConditionerUpCommand implements Command{
	private AirConditioner _airConditioner;
	
	public AirConditionerUpCommand(AirConditioner airConditioner) {
		_airConditioner = airConditioner;
	}
	public void execute() {
		System.out.println("Commanding the air conditioner to turn up");
		_airConditioner.up();
	}
	public String getName() {
		return "AC UP";
	}
}

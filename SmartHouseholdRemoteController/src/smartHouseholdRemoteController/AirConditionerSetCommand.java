package smartHouseholdRemoteController;

public class AirConditionerSetCommand implements Command{
	private AirConditioner _airConditioner;
	
	public AirConditionerSetCommand(AirConditioner airConditioner) {
		_airConditioner = airConditioner;
	}
	public void execute() {
		System.out.println("Commanding the air conditioner to set at 25 degrees");
		_airConditioner.set(25);
	}
	public String getName() {
		return "AC SET";
	}
}

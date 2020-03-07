package smartHouseholdRemoteController;

public class AirConditionerOnCommand implements Command{
	private AirConditioner _airConditioner;
	
	public AirConditionerOnCommand(AirConditioner airConditioner) {
		_airConditioner = airConditioner;
	}
	public void execute() {
		System.out.println("Commanding the air conditioner to turn on");
		_airConditioner.on();
	}
	public String getName() {
		return "AC ON";
	}
}

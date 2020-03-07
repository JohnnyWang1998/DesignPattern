package smartHouseholdRemoteController;

public class AirConditionerOffCommand implements Command{
	private AirConditioner _airConditioner;
	
	public AirConditionerOffCommand(AirConditioner airConditioner) {
		_airConditioner = airConditioner;
	}
	public void execute() {
		System.out.println("Commanding the air conditioner to turn off");
		_airConditioner.off();
	}
	public String getName() {
		return "AC OFF";
	}
}

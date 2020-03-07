package smartHouseholdRemoteController;

public class AirConditionerDownCommand implements Command{
	private AirConditioner _airConditioner;
	
	public AirConditionerDownCommand(AirConditioner airConditioner) {
		_airConditioner = airConditioner;
	}
	public void execute() {
		System.out.println("Commanding the air conditioner to turn down");
		_airConditioner.down();
	}
	public String getName() {
		return "AC DOWN";
	}
}

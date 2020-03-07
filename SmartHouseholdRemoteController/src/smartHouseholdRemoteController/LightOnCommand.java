package smartHouseholdRemoteController;

public class LightOnCommand implements Command{
	private Light _light;
	
	public LightOnCommand(Light light) {
		_light = light;
	}
	public void execute() {
		System.out.println("Commanding the light to turn on");
		_light.on();
	}
	public String getName() {
		return "Lt ON";
	}
}

package smartHouseholdRemoteController;

public class LightOffCommand implements Command {
	private Light _light;
	public LightOffCommand(Light light) {
		_light = light;
	}
	public void execute() {
		System.out.println("Commanding the light to turn off");
		_light.off();
	}
	public String getName() {
		return "Lt OFF";
	}
}

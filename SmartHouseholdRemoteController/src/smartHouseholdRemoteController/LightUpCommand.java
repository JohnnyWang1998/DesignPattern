package smartHouseholdRemoteController;

public class LightUpCommand implements Command{
	private Light _light;
	
	public LightUpCommand(Light light) {
		_light = light;
	}
	public void execute() {
		System.out.println("Commanding the light to turn up");
		_light.up();
	}
	public String getName() {
		return "Lt UP";
	}
}

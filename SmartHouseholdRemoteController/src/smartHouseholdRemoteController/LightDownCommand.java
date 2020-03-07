package smartHouseholdRemoteController;

public class LightDownCommand implements Command{
	private Light _light;
	
	public LightDownCommand(Light light) {
		_light = light;
	}
	public void execute() {
		System.out.println("Commanding the light to turn down");
		_light.down();
	}
	public String getName() {
		return "Lt DOWN";
	}
}

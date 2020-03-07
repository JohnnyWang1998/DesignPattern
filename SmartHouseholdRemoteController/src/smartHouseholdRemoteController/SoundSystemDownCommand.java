package smartHouseholdRemoteController;

public class SoundSystemDownCommand implements Command{
	private SoundSystem _soundSystem;
	public SoundSystemDownCommand(SoundSystem soundSystem) {
		_soundSystem = soundSystem;
	}
	public void execute() {
		System.out.println("Commanding the sound system to turn down");
		_soundSystem.off();
	}
	public String getName() {
		return "SS DOWN";
	}
}

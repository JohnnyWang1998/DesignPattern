package smartHouseholdRemoteController;

public class SoundSystemOffCommand implements Command{
	private SoundSystem _soundSystem;
	public SoundSystemOffCommand(SoundSystem soundSystem) {
		_soundSystem = soundSystem;
	}
	public void execute() {
		System.out.println("Commanding the sound system to turn off");
		_soundSystem.off();
	}
	public String getName() {
		return "SS OFF";
	}
}

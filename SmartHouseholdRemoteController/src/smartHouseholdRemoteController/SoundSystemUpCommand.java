package smartHouseholdRemoteController;

public class SoundSystemUpCommand implements Command{
	private SoundSystem _soundSystem;
	public SoundSystemUpCommand(SoundSystem soundSystem) {
		_soundSystem = soundSystem;
	}
	public void execute() {
		System.out.println("Commanding the sound system to turn up");
		_soundSystem.up();
	}
	public String getName() {
		return "SS UP";
	}
}

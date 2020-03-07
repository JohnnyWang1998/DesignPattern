package smartHouseholdRemoteController;

public class SoundSystemOnCommand implements Command{
	private SoundSystem _soundSystem;
	public SoundSystemOnCommand(SoundSystem soundSystem) {
		_soundSystem = soundSystem;
	}
	public void execute() {
		System.out.println("Commanding the sound system to turn on");
		_soundSystem.on();
	}
	public String getName() {
		return "SS ON";
	}
}

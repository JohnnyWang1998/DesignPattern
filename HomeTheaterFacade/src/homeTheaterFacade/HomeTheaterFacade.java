package homeTheaterFacade;

public class HomeTheaterFacade {
	private Amplifier _amplifier;
	private CdPlayer _cdPlayer;
	private DvdPlayer _dvdPlayer;
	private PopcornPopper _popcornPopper;
	private Projecter _projecter;
	private Screen _screen;
	private TheaterLights _theaterLights;
	private Tuner _tuner;
	
	public HomeTheaterFacade(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer
			,PopcornPopper popcornPopper, Projecter projecter
			, Screen screen, TheaterLights theaterLights, Tuner tuner) {
		_amplifier = amplifier;
		_cdPlayer = cdPlayer;
		_dvdPlayer = dvdPlayer;
		_popcornPopper = popcornPopper;
		_projecter = projecter;
		_screen = screen;
		_theaterLights = theaterLights;
		_tuner = tuner;
	}
	public void watchMovie(String movie) {
		_popcornPopper.on();
		_popcornPopper.pop();
		_theaterLights.dim(10);
		_screen.down();
		_projecter.on();
		_projecter.wideScreenMode();
		_amplifier.on();
		_amplifier.setCd(_cdPlayer);
		_amplifier.setSurroundSound();
		_amplifier.setVolume(5);
		_dvdPlayer.on();
		_dvdPlayer.play(movie);
	}
	public void endMovie() {
		_dvdPlayer.pause();
		_dvdPlayer.eject();
		_dvdPlayer.off();
		_amplifier.off();
		_projecter.off();
		_screen.up();
		_theaterLights.off();
		_popcornPopper.off();
	}
}

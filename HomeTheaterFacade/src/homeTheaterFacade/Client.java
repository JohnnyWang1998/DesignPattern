package homeTheaterFacade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amplifier amplifier = new Amplifier("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amplifier);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amplifier);
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amplifier);
		Projecter projecter = new Projecter("Top-O-Line Projector", dvd);
		TheaterLights theaterLights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");
		
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, cd, dvd, popcornPopper, projecter, screen, theaterLights, tuner);
		//Due to the limited information, I only implement the first two method
		System.out.println("Now let's watch Titanic!");
		homeTheaterFacade.watchMovie("Titanic");
		System.out.println("...\n...\n...\nEnd of the movie");
		homeTheaterFacade.endMovie();
	}
}
/*import java.awt.BorderLayout;
import javax.swing.*;
public class Client extends JFrame {
	private JRadioButton jrb1, jrb2;
	public Client(){
		JRadioButton jrb1 = new JRadioButton("Radio 1");
		JRadioButton jrb2 = new JRadioButton("Radio 2");
		ButtonGroup btg = new ButtonGroup();
		btg.add(jrb1);
		btg.add(jrb2);
		add(jrb1, BorderLayout.WEST);
		add(jrb2, BorderLayout.EAST);
	}
	public static void main(String[] args) {
		Client frame = new Client();
		frame.setTitle("GroupRadios");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 120);
		frame.setVisible(true);
	}
}*/
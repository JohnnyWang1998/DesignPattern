package smartHouseholdRemoteController;

import java.util.ArrayList;

public class OffAllCommand implements Command {
	private ArrayList<Command> offAllCommand;
	
	public OffAllCommand() {
		offAllCommand = new ArrayList<Command>();
	}
	public void execute() {
		System.out.println("Commanding all the applicances to turn off:");
		for(int i = 0; i < offAllCommand.size(); i++ )
			offAllCommand.get(i).execute();
	}
	public void addOffCommand(Command command) {
		offAllCommand.add(command);
	}
	
	public String getName() {
		return "APP ALLOFF";
	}
}

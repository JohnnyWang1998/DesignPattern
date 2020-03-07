package smartHouseholdRemoteController;

public class RemoteController {
	private Command[] _onCommand;
	private Command[] _offCommand;
	//I declare the up and down command here
	private Command[] _upCommand;
	private Command[] _downCommand;
	private Command[] _setCommand;
	//I declare the turn off all command here, and I added a new command class called the OffAllCommand
	private OffAllCommand _offAllCommand;
	private int _buttonNumber;
	//These specific slots are set to control the corresponding applicances
	private int lightSlot_1;
	private int lightSlot_2;
	private int airConditionerSlot_1;
	private int airConditionerSlot_2;
	
	public RemoteController(int buttonNumber) {
		_buttonNumber = buttonNumber;
		_onCommand = new Command[_buttonNumber];
		_offCommand = new Command[_buttonNumber];
		_upCommand = new Command[_buttonNumber];
		_downCommand = new Command[_buttonNumber];
		_setCommand = new Command[_buttonNumber];
		_offAllCommand = new OffAllCommand();
		for(int i = 0; i < _buttonNumber; i++) {
			_onCommand[i] = null;
			_offCommand[i] = null; 
			_upCommand[i] = null;
			_downCommand[i] = null;
			_setCommand[i]= null; 
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand, Command upCommand, Command downCommand) {
		_onCommand[slot] = onCommand;
		_offCommand[slot] = offCommand;
		_upCommand[slot] = upCommand;
		_downCommand[slot] = downCommand;
		_offAllCommand.addOffCommand(offCommand);
	}
	
	public void setComfortableModeCommand(int slot1, int slot2, int slot3, int slot4, Command setCommand1, Command setCommand2) {
		lightSlot_1 = slot1;
		lightSlot_2 = slot2;
		airConditionerSlot_1 = slot3;
		airConditionerSlot_2 = slot4;
		_setCommand[slot3] = setCommand1;
		_setCommand[slot4] = setCommand2;
	}
	//Here's how the comfortable mode implements
	public void comfortableModeButtonPushed() {
		_offCommand[lightSlot_1].execute();
		_offCommand[lightSlot_2].execute();
		_setCommand[airConditionerSlot_1].execute();
		_setCommand[airConditionerSlot_2].execute();
		
	}
	public void onButtonPushed(int slot) {
		_onCommand[slot].execute();
	}
	public void offButtonPushed(int slot) {
		_offCommand[slot].execute();
	}
	public void upButtonPushed(int slot) {
		_upCommand[slot].execute();
	}
	public void downButtonPushed(int slot) {
		_downCommand[slot].execute();
	}
	public void offAllButtonPushed() {
		_offAllCommand.execute();
	}
	//Display the buttons
	public void display() {
		for(int i = 0; i < _buttonNumber; i++) {
			System.out.print("[" + i + "]-> ");
			if(_onCommand != null) {
				System.out.print("\t" + _onCommand[i].getName() + "\t" + _offCommand[i].getName());
				System.out.print("\t" + _upCommand[i].getName() + "\t" + _downCommand[i].getName() + "\n");
			}
			else
				System.out.print("\tNA\tNA\t");
		}
		System.out.print("\t" + _offAllCommand.getName());
		System.out.println("\t COM MODE");
	}
}

package smartHouseholdRemoteController;

public class Client {
	public static void main(String[] args) {
		final int LIVING_ROOM_AC = 0;
		final int BED_ROOM_AC = 1;
		final int LIVING_ROOM_TV = 2;
		final int LIVING_ROOM_LIGHT = 3;
		final int BED_ROOM_LIGHT = 4;
		final int SOUND_SYSTEM = 5;
		final int WASH_ROOM_LIGHT = 6;
		
		RemoteController rc = new RemoteController(7);
		//Slot 0 of controller
		AirConditioner livingRoomAC = new AirConditioner();
		AirConditionerOnCommand  lrACOnCommand = new AirConditionerOnCommand(livingRoomAC);
		AirConditionerOffCommand  lrACOffCommand = new AirConditionerOffCommand(livingRoomAC);
		AirConditionerUpCommand lrACUpCommand = new AirConditionerUpCommand(livingRoomAC);
		AirConditionerDownCommand lrACDownCommand = new AirConditionerDownCommand(livingRoomAC);
		AirConditionerSetCommand lrACSetCommand = new AirConditionerSetCommand(livingRoomAC);
		rc.setCommand(LIVING_ROOM_AC, lrACOnCommand, lrACOffCommand, lrACUpCommand, lrACDownCommand);

		//Slot 1 of controller
		AirConditioner  bedRoomAC = new AirConditioner();
		AirConditionerOnCommand  brACOnCommand = new AirConditionerOnCommand(bedRoomAC);
		AirConditionerOffCommand  brACOffCommand = new AirConditionerOffCommand(bedRoomAC);
		AirConditionerUpCommand brACUpCommand = new AirConditionerUpCommand(bedRoomAC);
		AirConditionerDownCommand brACDownCommand = new AirConditionerDownCommand(bedRoomAC);
		AirConditionerSetCommand brACSetCommand = new AirConditionerSetCommand(bedRoomAC);
		rc.setCommand(BED_ROOM_AC, brACOnCommand, brACOffCommand, brACUpCommand, brACDownCommand);

		//Slot 2 of controller
		TV  myTV = new TV();
		TVOnCommand  tvOnCommand = new TVOnCommand(myTV);
		TVOffCommand  tvOffCommand = new TVOffCommand(myTV);
		TVUpCommand tvUpCommand = new TVUpCommand(myTV);
		TVDownCommand tvDownCommand = new TVDownCommand(myTV);
		rc.setCommand(LIVING_ROOM_TV, tvOnCommand, tvOffCommand, tvUpCommand, tvDownCommand);

		//Slot 3 of controller
		Light  livingRoomLight = new Light();
		LightOnCommand  lrLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand  lrLightOffCommand = new LightOffCommand(livingRoomLight);
		LightUpCommand lrLightUpCommand = new LightUpCommand(livingRoomLight);
		LightDownCommand lrLightDownCommand = new LightDownCommand(livingRoomLight);
		rc.setCommand(LIVING_ROOM_LIGHT, lrLightOnCommand, lrLightOffCommand, lrLightUpCommand, lrLightDownCommand);

		//Slot 4 of controller
		Light  bedRoomLight = new Light();
		LightOnCommand  brLightOnCommand = new LightOnCommand(bedRoomLight);
		LightOffCommand  brLightOffCommand = new LightOffCommand(bedRoomLight);
		LightUpCommand brLightUpCommand = new LightUpCommand(bedRoomLight);
		LightDownCommand brLightDownCommand = new LightDownCommand(bedRoomLight);
		rc.setCommand(BED_ROOM_LIGHT, brLightOnCommand, brLightOffCommand, brLightUpCommand, brLightDownCommand);

		//Slot 5 of controller
		//I remove the dining room light
		//Light  diningRoomLight = new Light();
		//LightOnCommand  drLightOnCommand = new LightOnCommand(diningRoomLight);
		//LightOffCommand  drLightOffCommand = new LightOffCommand(diningRoomLight);
		//rc.setCommand(DINING_ROOM_LIGHT, drLightOnCommand, drLightOffCommand);
		SoundSystem soundSystem = new SoundSystem();
		SoundSystemOnCommand soundSystemOnCommand = new SoundSystemOnCommand(soundSystem);
		SoundSystemOffCommand soundSystemOffCommand = new SoundSystemOffCommand(soundSystem);
		SoundSystemUpCommand soundSystemUpCommand = new SoundSystemUpCommand(soundSystem);
		SoundSystemDownCommand soundSystemDownCommand = new SoundSystemDownCommand(soundSystem);
		rc.setCommand(SOUND_SYSTEM, soundSystemOnCommand, soundSystemOffCommand,soundSystemUpCommand, soundSystemDownCommand);
		
		//Slot 6 of controller
		Light  washRoomLight = new Light();
		LightOnCommand  wrLightOnCommand = new LightOnCommand(washRoomLight);
		LightOffCommand  wrLightOffCommand = new LightOffCommand(washRoomLight);
		LightUpCommand wrLightUpCommand = new LightUpCommand(washRoomLight);
		LightDownCommand wrLightDownCommand = new LightDownCommand(washRoomLight);
		rc.setCommand(WASH_ROOM_LIGHT, wrLightOnCommand, wrLightOffCommand, wrLightUpCommand, wrLightDownCommand);
		
		//set comfortable mode command so that it will control the corresponding applicances correctly
		rc.setComfortableModeCommand(LIVING_ROOM_LIGHT, WASH_ROOM_LIGHT, LIVING_ROOM_AC, BED_ROOM_AC, lrACSetCommand, brACSetCommand);
		
		//Show the remote controller and the buttons
		System.out.println("-----Now here is the remote controller-----");
		rc.display();
		
		//Task 1, sound system
		System.out.println("-----Now try to control the sound system-----");		
		rc.onButtonPushed(SOUND_SYSTEM);		
		rc.offButtonPushed(SOUND_SYSTEM);
		
		//Task 2, turn off all the applicances at once
		rc.onButtonPushed(LIVING_ROOM_AC);
		rc.onButtonPushed(WASH_ROOM_LIGHT);
		rc.onButtonPushed(SOUND_SYSTEM);
		rc.onButtonPushed(BED_ROOM_LIGHT);
		rc.onButtonPushed(LIVING_ROOM_LIGHT);
		rc.onButtonPushed(BED_ROOM_AC);
		rc.onButtonPushed(LIVING_ROOM_TV);
		System.out.println("-----Now turn off all the applicances-----");
		rc.offAllButtonPushed();
		
		//Task 3, up and down
		System.out.println("-----Now try to turn up or turn down the air conditioner-----");
		rc.onButtonPushed(LIVING_ROOM_AC);	
		rc.upButtonPushed(LIVING_ROOM_AC);
		rc.downButtonPushed(LIVING_ROOM_AC);
		
		//Task 4
		System.out.println("-----Now turn on the comfortable mode-----");
		rc.comfortableModeButtonPushed();
	}
}

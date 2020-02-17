package gumballMachine;

public class SoldOutState implements State {
	private GumballMachine _gumballMachine; 
	public SoldOutState(GumballMachine gumballMachine) {
		_gumballMachine=gumballMachine;
	}
	public void insertQuarter() {
		System.out.println("You can not insert a quarter, the machine is sold out");
	}
	public void ejectQuarter() {
		System.out.println("You can not eject, you have not insert a quarter yet");
	}
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
}

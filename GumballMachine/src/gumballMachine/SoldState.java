package gumballMachine;

public class SoldState implements State{
	private GumballMachine _gumballMachine;
	public SoldState(GumballMachine gumballMachine) {
		_gumballMachine=gumballMachine;
	}
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
	public void dispense() {
		_gumballMachine.releaseBall();
		if (_gumballMachine.getCount() > 0)
			_gumballMachine.setState(_gumballMachine.getNoQuarterState());
		else {
			System.out.println("Oops, out of gumballs");
			_gumballMachine.setState(_gumballMachine.getSoldOutState());
		}
	}
}

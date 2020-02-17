package gumballMachine;

import java.util.Random;

public class HasQuarterState implements State{
	private GumballMachine _gumballMachine;
	//Generate random number
	private Random random = new Random(System.currentTimeMillis());
	public HasQuarterState(GumballMachine gumballMachine) {
		_gumballMachine=gumballMachine;
	}
	public void insertQuarter() {
		System.out.println("You don't need to insert another quarter");
	}
	public void ejectQuarter() {
		System.out.println("You ejected a quarter");
		_gumballMachine.setState(_gumballMachine.getNoQuarterState());
	}
	public void turnCrank() {
		System.out.println("You turned the crank");
		int possibility = random.nextInt(10);
		//Limit the possibility to 10%
		//Test whether the number of gumballs is larger than 1
		if(possibility == 0 && _gumballMachine.getCount()>1) {
			_gumballMachine.setState(_gumballMachine.getWinnerState());
		}else {
			_gumballMachine.setState(_gumballMachine.getSoldState());
		}
	}
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
}

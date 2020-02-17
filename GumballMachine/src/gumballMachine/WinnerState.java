package gumballMachine;

public class WinnerState implements State {
	private GumballMachine _gumballMachine;
	public WinnerState(GumballMachine gumballMachine) {
		_gumballMachine=gumballMachine;
	}
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball");
	}
	public void dispense() {
		System.out.println("Congrats! You are the winner! You will have two gumballs");
		//Release the first ball
		_gumballMachine.releaseBall();
		if (_gumballMachine.getCount() == 0)
			_gumballMachine.setState(_gumballMachine.getNoQuarterState());
		else {
			//Release the second ball
			_gumballMachine.releaseBall();
			if(_gumballMachine.getCount()>0) {	
				_gumballMachine.setState(_gumballMachine.getNoQuarterState());
			}
			else{
				System.out.println("Oops, out of gumballs");
				_gumballMachine.setState(_gumballMachine.getSoldOutState());
			}
		}
	}
}

package gumballMachine;

public class NoQuarterState implements State {
	private GumballMachine _gumballMachine;
	public NoQuarterState(GumballMachine gumballMachine) {
		_gumballMachine=gumballMachine;
	}
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		_gumballMachine.setState(_gumballMachine.getHasQuarterState());
	}
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}
	public void dispense() {
		System.out.println("You need to pay first");
	}
}

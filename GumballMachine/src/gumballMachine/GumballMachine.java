package gumballMachine;

public class GumballMachine {
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;
	private State _state;
	private int _count = 0;
	public GumballMachine(int count) {
		_count = count;
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		if(count>0) {
			_state=noQuarterState;
		}else {
			_state=soldOutState;
		}
	}
	public void insertQuarter() {
		_state.insertQuarter();
	}
	public void ejectQuarter() {
		_state.ejectQuarter();
	}
	public void turnCrank() {
		_state.turnCrank();
		_state.dispense();
	}
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(_count!=0)
			_count--;
	}
	//Refill the ball
	public void refillBall(int number) {
		_count = number;
		System.out.println("\nThe gumball machine has been refilled with " + number +" balls");
	}
	//Display the current information for the gumball machine
	public void display() {
		if(_count>0)
			System.out.println("\nGumballs: " + _count + "\nWaiting for a quarter");
		else
			System.out.println("\nGumballs: " + _count + "\nNeed to fill in the gumballs");
	}
	public void setState(State state) {
		_state=state;
	}
	public State getSoldOutState() {
		return soldOutState;
	}
	public State getNoQuarterState() {
		return noQuarterState;
	}
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	public State getSoldState() {
		return soldState;
	}
	//Get method for winner state
	public State getWinnerState() {
		return winnerState;
	}
	public int getCount() {
		return _count;
	}
	}
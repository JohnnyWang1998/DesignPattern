package gumballMachine;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gumballMachine = new GumballMachine(5);
		gumballMachine.display();
		gumballMachine.insertQuarter(); 
		gumballMachine.turnCrank(); 
		
		gumballMachine.display();
		gumballMachine.insertQuarter(); 
		gumballMachine.turnCrank();
		
		gumballMachine.display();
		gumballMachine.insertQuarter(); 
		gumballMachine.turnCrank();
		
		gumballMachine.display();
		gumballMachine.insertQuarter(); 
		gumballMachine.turnCrank();
		
		gumballMachine.display();
		gumballMachine.insertQuarter(); 
		gumballMachine.turnCrank();
		
		//Refill the gumball machine
		gumballMachine.refillBall(5);
		
		gumballMachine.display();
		gumballMachine.insertQuarter(); 
		gumballMachine.turnCrank();
	}

}

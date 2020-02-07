package duck;

public class Test {
	private final static int NO_1=0;
	private final static int NO_2=1;
	private final static int NO_3=2;
	private final static int NO_4=3;
	private static final int N = NO_4+1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test for different ducks
		System.out.println("There are four different kinds of ducks:");
		Duck[] ducks = new Duck[N];
		ducks[NO_1] = new MallardDuck();
		ducks[NO_2] = new RedHeadDuck();
		ducks[NO_3] = new RubberDuck();
		ducks[NO_4] = new DecoyDuck();
		
		for(int i =0; i<N; i++) {
			System.out.println("----NO."+i+" duck----");
			ducks[i].swim();
			ducks[i].display();
			ducks[i].performFly();
			ducks[i].performQuack();
		}
		
		//Test for the setFlyBehavior method
		System.out.println("\nLet RubberDuck fly!");
		ducks[NO_3].display();
		ducks[NO_3].performFly();
		FlyBehavior fb = new FlyWithWings();
		ducks[NO_3].setFlyBehavior(fb);
		ducks[NO_3].performFly();
		
		//Test for the setQuackBehavior method
		System.out.println("\nLet DecoyDuck quack!");
		ducks[NO_4].display();
		ducks[NO_4].performQuack();
		QuackBehavior qb = new Quack();
		ducks[NO_4].setQuackBehavior(qb);
		ducks[NO_4].performQuack();
	}

}
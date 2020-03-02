package starbuzzCoffee;

public class Test {
	//Nested loops 
	/*
	public static int fact(int n) {
		if(n<1)
			return 1;
		else
			return(n*fact(n-1));
	}
	
	public static int sum(int n, int m) {
		if(n>0)
			return sum(n-1, m+n);
		else
			return m;
	}*/
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//The original Decaf Coffee
		Beverage drink = new Decaf();
		System.out.println(drink.getDescription() + ", " + drink.getSize() + "	$" + drink.cost());
		//Coffee with milk
		Beverage add = new Milk(drink);
		System.out.println(add.getDescription() + ", " + add.getSize() + "	$" + add.cost());
		//Change the size of the coffee
		Beverage cup = new Grand(add);
		System.out.println(cup.getDescription() + ", " + cup.getSize() +"	$" + cup.cost());
		//Let's enjoy the Espresso Coffee with milk and soy in venti size
		Beverage espresso = new Espresso();
		Beverage add1 = new Milk(espresso);
		Beverage add2 = new Soy(add1);
		Beverage beverage = new Venti(add2);
		System.out.println(beverage.getDescription() + ", " + beverage.getSize() +"	$" + beverage.cost());
	}

}

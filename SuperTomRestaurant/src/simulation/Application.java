package simulation;

import java.util.Random;
import menu.CafeMenu;
import menu.DinnerMenu;
import menu.PancakeHouseMenu;
import menu.Waitress;
import starbuzzCoffee.Beverage;
import starbuzzCoffee.HouseBlend;
import starbuzzCoffee.Milk;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int hour = random.nextInt(23 - 0 + 1) + 0;
		int min = random.nextInt(59 - 0 + 1) + 0;
		PancakeHouseMenu phMenu = new PancakeHouseMenu();
		DinnerMenu dMenu = new DinnerMenu();
		CafeMenu cMenu = new CafeMenu();
		
		//The customer comes at a random time
		Waitress Maris = new Waitress(phMenu, dMenu, cMenu);
		System.out.println("---------------------------\nTime is " + hour + ":" + min +". ");
		Maris.printMenu(hour, min);
		checkCoffee(Maris.getEatingTime());
		//The customer comes at specific time
		//Breakfast
		hour=7;
		min=30;
		System.out.println("---------------------------\nTime is " + hour + ":" + min +". ");
		Maris.printMenu(hour, min);
		checkCoffee(Maris.getEatingTime());
		//Lunch
		hour=12;
		min=20;
		System.out.println("---------------------------\nTime is " + hour + ":" + min +". ");
		Maris.printMenu(hour, min);
		checkCoffee(Maris.getEatingTime());
		//Dinner
		hour=19;
		min=50;
		System.out.println("---------------------------\nTime is " + hour + ":" + min +". ");
		Maris.printMenu(hour, min);
		checkCoffee(Maris.getEatingTime());
		//Midnight
		hour=0;
		min=40;
		System.out.println("---------------------------\nTime is " + hour + ":" + min +". ");
		Maris.printMenu(hour, min);
		checkCoffee(Maris.getEatingTime());
	}
	
	//If it is breakfast time then order a cup of coffee
	public static void checkCoffee(String time) {
		if(time == "Breakfast") {
			Beverage drink = new HouseBlend();
			Beverage add1 = new Milk(drink);
			Beverage beverage = new Milk(add1);
			System.out.println("\nOrder a cup of HouseBlend:");
			System.out.println(beverage.getDescription() + ", " + beverage.getSize() +"	$" + beverage.cost());
		}
	}
}

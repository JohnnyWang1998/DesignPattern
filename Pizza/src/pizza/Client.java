package pizza;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Order NY Style Clam Pizza
		PizzaStore pizzaStore = new NYPizzaStore();
		System.out.println("\n---I'd like to order one NY Style Clam Pizza please.---");
		pizzaStore.orderPizza("Clams");
		//Order NY Style Cheese Pizza
		System.out.println("\n---I'd like to order one NY Style Cheese Pizza please.---");
		pizzaStore.orderPizza("Cheese");
		//Order Chicago Style Clam Pizza
		pizzaStore = new ChicagoPizzaStore();
		System.out.println("\n---I'd like to order one Chicago Style Clam Pizza please.---");
		pizzaStore.orderPizza("Clams");
		//Order Chicago Style Cheese Pizza
		System.out.println("\n---I'd like to order one Chicago Style Cheese Pizza please.---");
		pizzaStore.orderPizza("Cheese");
	}

}

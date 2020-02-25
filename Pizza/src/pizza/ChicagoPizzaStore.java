package pizza;

public class ChicagoPizzaStore extends PizzaStore{
	public ChicagoPizzaStore() {
		pizzaIngredientFactory = new  ChicagoPizzaIngredientFactory();
	}
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("Cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		}
		else if(type.equals("Clams")) {
			pizza = new ChicagoStyleClamPizza();
		}
		return pizza;
	}
}


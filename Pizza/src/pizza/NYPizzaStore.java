package pizza;

public class NYPizzaStore extends PizzaStore{
	public NYPizzaStore() {
		pizzaIngredientFactory = new  NYPizzaIngredientFactory();
	}
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("Cheese")) {
			pizza = new NYStyleCheesePizza();
		}
		else if(type.equals("Clams")) {
			pizza = new NYStyleClamPizza();
		}
		return pizza;
	}
}

package pizza;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza() {
		pizzaIngredientFactory = new  ChicagoPizzaIngredientFactory();
	}
	public String getName() {
		return "Chicago Style Cheese Pizza";
	}
	public String getIngredient() {
		return pizzaIngredientFactory.creatCheese().getName();
	}
}

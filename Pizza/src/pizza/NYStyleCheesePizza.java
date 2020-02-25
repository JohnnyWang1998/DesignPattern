package pizza;

public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza() {
		pizzaIngredientFactory = new  NYPizzaIngredientFactory();
	}
	public String getName() {
		return "NY Style Cheese Pizza";
	}
	public String getIngredient() {
		return pizzaIngredientFactory.creatCheese().getName();
	}
}

package pizza;

public class NYStyleClamPizza extends Pizza{
	public NYStyleClamPizza() {
		pizzaIngredientFactory = new  NYPizzaIngredientFactory();
	}
	public String getName() {
		return "NY Style Clam Pizza";
	}
	public String getIngredient() {
		return pizzaIngredientFactory.creatClams().getName();
	} 
}

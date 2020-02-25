package pizza;

public class ChicagoStyleClamPizza extends Pizza{
	public ChicagoStyleClamPizza() {
		pizzaIngredientFactory = new  ChicagoPizzaIngredientFactory();
	}
	public String getName() {
		return "Chicago Style Clam Pizza";
	}
	public String getIngredient() {
		return pizzaIngredientFactory.creatClams().getName();
	}
}

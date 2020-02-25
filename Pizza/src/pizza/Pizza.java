package pizza;

public abstract class Pizza {
	protected PizzaIngredientFactory pizzaIngredientFactory;
	
	public abstract String getName();
	//I add the getIngredient method to get the ingredient from the PizzaIngredientFactory
	public abstract String getIngredient();
	public void prepare() {
		System.out.println("Preparing the " + getName());
	}
	public void bake() {
		System.out.println("Baking the " + getName());
	}
	public void cut() {
		System.out.println("Cutting the " + getName());
	}
	public void box() {
		System.out.println("Boxing the " + getName());
	}
}

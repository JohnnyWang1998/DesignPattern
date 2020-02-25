package pizza;

public abstract class PizzaStore {
	protected PizzaIngredientFactory pizzaIngredientFactory;
	public abstract Pizza createPizza(String type);
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		if(pizza == null) 
			System.out.println("Sorry, We don't have this type of Pizza yet! ");
		else {
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			System.out.println(pizza.getName() + " with " + pizza.getIngredient() + " is avalible now!");
		}
			
		return pizza;
	}
}

package pizza;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough creatDough() {
		return new ThinCrustDough();
	}
	public Sauce creatSauce() {
		return new MarinaraSauce();
	}
	public Cheese creatCheese() {
		return new ReggianoCheese();
	}
	public Clams creatClams() {
		return new FreshClams();
	}
}

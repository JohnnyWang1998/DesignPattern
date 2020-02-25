package pizza;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough creatDough() {
		return new ThickCrustDough();
	}
	public Sauce creatSauce() {
		return new PlumTomatoSauce();
	}
	public Cheese creatCheese() {
		return new MozzarellaCheese();
	}
	public Clams creatClams() {
		return new FrozenClams();
	}
}

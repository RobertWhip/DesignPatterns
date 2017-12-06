package pizza;

import ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	public void prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
		System.out.println("Preparing " + this.toString() + ", " + clam);
	}
}
package ingredient;

import ingredient.ingredients.dough.*;
import ingredient.ingredients.sauce.*;
import ingredient.ingredients.cheese.*;
import ingredient.ingredients.veggies.*;
import ingredient.ingredients.pepperoni.*;
import ingredient.ingredients.clams.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThickCrustDough();
	}
	
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(),
				new Onion(),
				new Mushroom(),
				new RedPepper()};
		return veggies;
	}
	
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClam() {
		return new FreshClams();
	}
}
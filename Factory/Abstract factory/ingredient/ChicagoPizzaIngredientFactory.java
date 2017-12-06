package ingredient;

import ingredient.ingredients.dough.*;
import ingredient.ingredients.sauce.*;
import ingredient.ingredients.cheese.*;
import ingredient.ingredients.veggies.*;
import ingredient.ingredients.pepperoni.*;
import ingredient.ingredients.clams.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThickCrustDough();
	}
	
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
	
	public Cheese createCheese() {
		return new Mozzarella();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new EggPlant(),
				new Spinach(),
				new BlackOlives()};
		return veggies;
	}
	
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClam() {
		return new FrozenClams();
	}
}
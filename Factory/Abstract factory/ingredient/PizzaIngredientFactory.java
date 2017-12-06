package ingredient;

import ingredient.ingredients.dough.Dough;
import ingredient.ingredients.sauce.Sauce;
import ingredient.ingredients.cheese.Cheese;
import ingredient.ingredients.veggies.Veggies;
import ingredient.ingredients.pepperoni.Pepperoni;
import ingredient.ingredients.clams.Clams;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
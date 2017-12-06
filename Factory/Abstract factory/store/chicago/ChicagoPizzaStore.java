package store.chicago;

import store.PizzaStore;
import pizza.*;
import ingredient.*;

public class ChicagoPizzaStore extends PizzaStore {
	Pizza pizza = null;
	PizzaIngredientFactory ingredientFactory = 
		new ChicagoPizzaIngredientFactory();
	
	public Pizza createPizza(String item) {
		
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
			
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
			
		} else {
			return null;
		}
		
		return pizza;
	}
}
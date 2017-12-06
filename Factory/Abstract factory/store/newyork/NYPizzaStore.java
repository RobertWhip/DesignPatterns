package store.newyork;

import store.PizzaStore;
import pizza.*;
import ingredient.*;

public class NYPizzaStore extends PizzaStore {
	Pizza pizza = null;
	PizzaIngredientFactory ingredientFactory = 
		new NYPizzaIngredientFactory();
	
	public Pizza createPizza(String item) {
		
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("NY Style Cheese Pizza");
			
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("NY Style Clam Pizza");
			
		} else {
			return null;
		}
		
		return pizza;
	}
}
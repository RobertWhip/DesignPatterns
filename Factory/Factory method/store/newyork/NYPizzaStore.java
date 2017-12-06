package store.newyork;

import store.PizzaStore;
import pizza.newyork.*;
import pizza.*;

public class NYPizzaStore extends PizzaStore {
	

	public Pizza createPizza(String item) {
		Pizza pizza;
		
		if (item.equals("cheese")) {
			pizza = new NYStyleCheesePizza();			
		} else if (item.equals("clam")) {
			pizza = new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		} else if (item.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		} else {
			return null;
		}
		
		return pizza;
	}
}
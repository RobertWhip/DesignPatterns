package store.california;

import store.PizzaStore;
import pizza.california.*;
import pizza.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {
	public Pizza createPizza(String type) {
		Pizza pizza;
		
		if (type.equals("cheese")) {
			pizza = new CaliforniaStyleCheesePizza();
		} else if (type.equals("clam")) {
			pizza = new CaliforniaStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new CaliforniaStylePepperoniPizza();
		} else if (type.equals("veggie")) {
			pizza = new CaliforniaStyleVeggiePizza();
		} else {
			pizza = null;
		}
		
		return pizza;
	}
}
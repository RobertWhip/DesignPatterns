package store.chicago;

import store.PizzaStore;
import pizza.chicago.*;
import pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
	
	public Pizza createPizza(String item) {
		Pizza pizza;
		
		if (item.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (item.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();		
		} else if (item.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();		
		} else if (item.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza();		
		} else {
			return null;
		}
		
		return pizza;
	}
}
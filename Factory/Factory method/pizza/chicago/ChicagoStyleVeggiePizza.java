package pizza.chicago;

import pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Style Veggie Pizza";
		dough = "Thick Crust Dough";
		sauce = "Tasty Sauce";
		
		toppings.add("Onion");
		toppings.add("Broccoli");
		toppings.add("Spinach");
	}
}
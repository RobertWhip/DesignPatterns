package pizza.newyork;

import pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {
	public NYStyleVeggiePizza() {
		name = "NY Style Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Salty Sauce";
		
		toppings.add("Onion"); 
		toppings.add("Broccoli");
		toppings.add("Spinach");
	}
}
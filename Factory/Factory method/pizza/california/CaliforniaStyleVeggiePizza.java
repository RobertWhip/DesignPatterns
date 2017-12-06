package pizza.california;

import pizza.Pizza;

public class CaliforniaStyleVeggiePizza extends Pizza {
	public CaliforniaStyleVeggiePizza() {
		name = "California Style Veggie Pizza";
		dough = "Big Dough";
		sauce = "Black Sauce";
		
		toppings.add("Spinach");
		toppings.add("Round Onion");
		toppings.add("Potato");
	}
}
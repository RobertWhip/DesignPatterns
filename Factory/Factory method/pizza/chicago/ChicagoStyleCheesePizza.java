package pizza.chicago;

import pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Cheese Pizza";
		dough = "Thick Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Ultra Cheese Mountain");
		toppings.add("Mushrooms");
	}
}
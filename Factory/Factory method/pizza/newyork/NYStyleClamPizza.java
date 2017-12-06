package pizza.newyork;

import pizza.Pizza;

public class NYStyleClamPizza extends Pizza {
	public NYStyleClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Fresh Clams");
	}
}
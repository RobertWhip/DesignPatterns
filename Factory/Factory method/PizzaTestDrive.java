import store.PizzaStore;
import store.newyork.NYPizzaStore;
import store.chicago.ChicagoPizzaStore;
import store.california.CaliforniaPizzaStore;

import pizza.Pizza;

public class PizzaTestDrive {
	public static void main(String... args) {
		PizzaStore nyStore, chicagoStore, californiaStore;
		nyStore = new NYPizzaStore();
		chicagoStore = new ChicagoPizzaStore();
		californiaStore = new CaliforniaPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza);
		
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza);
		
		pizza = californiaStore.orderPizza("pepperoni");
		System.out.println("Jack ordered a " + pizza);
	}
}
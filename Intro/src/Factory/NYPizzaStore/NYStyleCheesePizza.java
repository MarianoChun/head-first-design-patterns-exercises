package Factory.NYPizzaStore;

import Factory.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizaa";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

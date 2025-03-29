package Factory;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings: ");
        for (String topping: toppings) {
            System.out.println("    " + topping);
        }
    }

    protected void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    protected void box() {
        System.out.println("Plaze pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}

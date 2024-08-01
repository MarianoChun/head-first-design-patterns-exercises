package Decorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage espresso2 = new Espresso();
        espresso2 = new Soy(espresso2);
        System.out.println(espresso2.getDescription() + " $" + espresso2.cost() + " Size " + espresso2.getSize());
        espresso2.setSize(Beverage.Size.GRANDE);
        System.out.println(espresso2.getDescription() + " $" + espresso2.cost() + " Size " + espresso2.getSize());
        espresso2.setSize(Beverage.Size.VENTI);
        System.out.println(espresso2.getDescription() + " $" + espresso2.cost() + " Size " + espresso2.getSize());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

    }
}

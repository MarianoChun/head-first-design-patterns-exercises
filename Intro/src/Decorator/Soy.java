package Decorator;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = 0;
        switch (size) {
            case TALL -> cost = .10;
            case GRANDE -> cost = .15;
            case VENTI -> cost = .20;
        }
        return beverage.cost() + cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}

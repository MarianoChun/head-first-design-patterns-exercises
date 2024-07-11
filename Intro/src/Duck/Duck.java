package Duck;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }
    public void display(){}

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}

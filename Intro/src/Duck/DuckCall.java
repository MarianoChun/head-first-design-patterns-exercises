package Duck;


// A duck call is a device that hunters use to mimic the calls (quacks) of ducks
public class DuckCall {
    QuackBehavior quackBehavior;

    // We let the user set the quack behavior to use when creating the duck call device for the first time
    public DuckCall(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}

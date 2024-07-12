package Duck;

public class MiniDuckSimulator {
    public static void main(String []args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        System.out.println("Changing fly behavior in runtime to Fly Rocketed Powered!");
        model.setFlyBehavior(new FlyRocketedPowered());
        model.performFly();

        DuckCall duckCall = new DuckCall(new Quack());
        duckCall.performQuack();
        duckCall.setQuackBehavior(new Squeak());
        duckCall.performQuack();
    }

}

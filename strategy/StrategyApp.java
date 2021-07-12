public class StrategyApp {
  public static void main(String[] args) {
    // Duck mallard = new MallardDuck();
    // mallard.performQuack();
    // mallard.performFly();
    // mallard.setFlyBehavior(new FlyNoWay());
    // mallard.setQuackBehavior(new Squeak());
    // mallard.performQuack();
    // mallard.performFly();
    Duck md = new MallaredDuck(new MuteQuack(), new FlyWithWings());
    md.performFly();
    md.performQuack();
    md.display();
    md.setQuackBehavior(new Squeak());
    md.setFlyBehavior(new FlyNoWay());
    md.performFly();
    md.performQuack();
  }
}

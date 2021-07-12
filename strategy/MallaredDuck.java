public class MallaredDuck extends Duck {
  public MallaredDuck() {

  }

  public MallaredDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
    super(quackBehavior, flyBehavior);
  }

  @Override
  public void display() {
    System.out.println("MallaredDuck");
  }
}

public abstract class Duck {
  QuackBehavior quackBehavior;
  FlyBehavior flyBehavior;

  public Duck() {

  }

  public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
    this.quackBehavior = quackBehavior;
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void performQuack() {
    this.quackBehavior.quack();
  }

  public void performFly() {
    this.flyBehavior.fly();
  }

  public abstract void display();
}

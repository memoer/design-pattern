// Duck 객체가 모자라서, TurKey객체를 사용해야 하는 경우
public class TurkeyAdapter implements Duck {
  Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void fly() {
    turkey.fly();
  }
}

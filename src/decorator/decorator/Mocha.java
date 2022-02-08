package decorator.decorator;

import decorator.beverage.Beverage;

// 모든 데코레이터는 Beverage 객체가 들어갈 자리에 들어갈 수 있어야 한다.
public class Mocha extends Beverage {
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return .20 + beverage.cost();
  }
}

package decorator.decorator;

import decorator.beverage.Beverage;

public class Whip extends Beverage {
  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return .20 + beverage.cost();
  }
}

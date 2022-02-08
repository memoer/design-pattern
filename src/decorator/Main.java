package decorator;

import decorator.beverage.Americano;
import decorator.beverage.Beverage;
import decorator.decorator.Mocha;
import decorator.decorator.Whip;

public class Main {
  public static void main(String[] args) {
    Beverage americano = new Whip(new Mocha(new Americano()));
    System.out.println(americano.cost());
  }
}

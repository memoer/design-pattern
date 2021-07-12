public class DecoratorApp {
  public static void main(String args[]) {
    Beverage beverage = new Mocha(new Mocha(new Espresso()));
    Beverage beverage2 = new Mocha(new Whip(new HouseBlend()));

    System.out.println(beverage.getDescription());
    System.out.println(beverage.cost());

    System.out.println(beverage2.getDescription());
    System.out.println(beverage2.cost());
  }
}

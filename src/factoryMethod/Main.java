package factoryMethod;

import factoryMethod.pizza.Pizza;
import factoryMethod.pizzaStore.ChicagoPizzaStore;
import factoryMethod.pizzaStore.NYPizzaStore;
import factoryMethod.pizzaStore.PizzaStore;

public class Main {
  public static void main(String[] args) {
    PizzaStore NYps = new NYPizzaStore();
    PizzaStore cps = new ChicagoPizzaStore();

    NYps.orderPizza("cheese");
    cps.orderPizza("cheese");
  }
}

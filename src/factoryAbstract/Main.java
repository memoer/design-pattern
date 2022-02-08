package factoryAbstract;

import factoryAbstract.pizza.Pizza;
import factoryAbstract.pizzaStore.ChicagoPizzaStore;
import factoryAbstract.pizzaStore.NYPizzaStore;
import factoryAbstract.pizzaStore.PizzaStore;

public class Main {
  public static void main(String[] args) {
    PizzaStore NYps = new NYPizzaStore();
    PizzaStore cps = new ChicagoPizzaStore();

    NYps.orderPizza("cheese");
    cps.orderPizza("cheese");
  }
}

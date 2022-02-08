package factoryMethod.pizzaStore;

import factoryMethod.pizza.Pizza;

public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza = this.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    return pizza;
  }

  public abstract Pizza createPizza(String type);
}

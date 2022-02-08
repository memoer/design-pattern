package factorySimple;

import factorySimple.pizza.Pizza;

public class PizzaStore {
  SimpleFactory sf;

  public PizzaStore() {
    sf = new SimpleFactory();
  }

  public Pizza orderPizza(String type) {
    Pizza pizza = sf.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    return pizza;
  }
}

package factorySimple;

import factorySimple.pizza.CheesePizza;
import factorySimple.pizza.ClamPizza;
import factorySimple.pizza.Pizza;
import factorySimple.pizza.VeggiePizza;

public class SimpleFactory {
  public Pizza createPizza(String type) {
    switch (type) {
      case "cheese":
        return new CheesePizza();
      case "veggie":
        return new VeggiePizza();
      case "clam":
        return new ClamPizza();
      default:
        throw new IllegalArgumentException();
    }
  }
}

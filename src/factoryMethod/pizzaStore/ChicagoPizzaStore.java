package factoryMethod.pizzaStore;

import factoryMethod.pizza.Pizza;
import factoryMethod.pizza.chicago.CheesePizza;
import factoryMethod.pizza.chicago.ClamPizza;
import factoryMethod.pizza.chicago.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
  @Override
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

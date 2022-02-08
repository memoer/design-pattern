package factoryMethod.pizzaStore;

import factoryMethod.pizza.Pizza;
import factoryMethod.pizza.NY.CheesePizza;
import factoryMethod.pizza.NY.ClamPizza;
import factoryMethod.pizza.NY.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
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

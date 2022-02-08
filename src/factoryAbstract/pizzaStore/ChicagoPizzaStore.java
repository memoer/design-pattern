package factoryAbstract.pizzaStore;

import factoryAbstract.pizza.Pizza;
import factoryAbstract.pizza.chicago.CheesePizza;
import factoryAbstract.pizza.chicago.ClamPizza;
import factoryAbstract.pizza.chicago.VeggiePizza;

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

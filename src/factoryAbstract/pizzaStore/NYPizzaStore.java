package factoryAbstract.pizzaStore;

import factoryAbstract.pizza.Pizza;
import factoryAbstract.pizza.NY.CheesePizza;
import factoryAbstract.pizza.NY.ClamPizza;
import factoryAbstract.pizza.NY.VeggiePizza;

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

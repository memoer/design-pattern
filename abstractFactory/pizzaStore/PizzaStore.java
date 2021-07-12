package pizzaStore;

import pizza.Pizza;
import pizza.PizzaType;
import pizzaIngredient.PizzaIngrdientFactory;

public abstract class PizzaStore {
  PizzaIngrdientFactory pizzaIngrdientFactory;

  public Pizza orderPizza(PizzaType pizzaType) {
    Pizza pizza = createPizza(pizzaType);
    System.out.println("------ orderPizza -------");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    System.out.println("------ orderPizza -------");
    return pizza;
  }

  protected abstract Pizza createPizza(PizzaType pizzaType);
}

package pizza;

import pizzaIngredient.PizzaIngrdientFactory;
import pizzaIngredient.PizzaIngredientType;

public class CheesePizza extends Pizza {
  public CheesePizza(PizzaIngrdientFactory pizzaIngrdientFactory) {
    super(pizzaIngrdientFactory);
    this.pizzaType = PizzaType.CHEESE;
  }

  @Override
  public void prepare() {
    super.prepare();
    pizzaIngredientList.add(pizzaIngrdientFactory.createIngredient(PizzaIngredientType.CHEESE));
  }
}

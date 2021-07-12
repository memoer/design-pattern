package pizza;

import pizzaIngredient.PizzaIngrdientFactory;
import pizzaIngredient.PizzaIngredientType;

public class ClamPizza extends Pizza {
  public ClamPizza(PizzaIngrdientFactory pizzaIngrdientFactory) {
    super(pizzaIngrdientFactory);
    this.pizzaType = PizzaType.CLAM;
  }

  @Override
  public void prepare() {
    super.prepare();
    pizzaIngredientList.add(pizzaIngrdientFactory.createIngredient(PizzaIngredientType.CLAM));
  }
}

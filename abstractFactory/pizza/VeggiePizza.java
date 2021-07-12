package pizza;

import pizzaIngredient.PizzaIngrdientFactory;
import pizzaIngredient.PizzaIngredientType;

public class VeggiePizza extends Pizza {
  public VeggiePizza(PizzaIngrdientFactory pizzaIngrdientFactory) {
    super(pizzaIngrdientFactory);
    this.pizzaType = PizzaType.VEGGIE;
  }

  @Override
  public void prepare() {
    super.prepare();
    pizzaIngredientList.add(pizzaIngrdientFactory.createIngredient(PizzaIngredientType.VEGGIE));
  }
}

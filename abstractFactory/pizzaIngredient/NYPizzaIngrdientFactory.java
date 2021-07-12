package pizzaIngredient;

public class NYPizzaIngrdientFactory implements PizzaIngrdientFactory {
  @Override
  public PizzaIngredient createIngredient(PizzaIngredientType pizzaIngredientType) {
    return new PizzaIngredient(pizzaIngredientType, PizzaIngredientStyle.NEWYORK);
  }
}

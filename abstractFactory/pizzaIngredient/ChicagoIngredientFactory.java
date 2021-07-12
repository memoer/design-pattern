package pizzaIngredient;

public class ChicagoIngredientFactory implements PizzaIngrdientFactory {
  @Override
  public PizzaIngredient createIngredient(PizzaIngredientType pizzaIngredientType) {
    return new PizzaIngredient(pizzaIngredientType, PizzaIngredientStyle.CHICAGO);
  }
}

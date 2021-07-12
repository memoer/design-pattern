package pizzaIngredient;

public class PizzaIngredient {
  PizzaIngredientType pizzaIngredientType;
  PizzaIngredientStyle pizzaIngredientStyle;

  public PizzaIngredient(PizzaIngredientType pizzaIngredientType, PizzaIngredientStyle pizzaIngredientStyle) {
    this.pizzaIngredientType = pizzaIngredientType;
    this.pizzaIngredientStyle = pizzaIngredientStyle;
  }

  // getter
  public PizzaIngredientType getPizzaIngredientType() {
    return pizzaIngredientType;
  }

  public PizzaIngredientStyle getPizzaIngredientStyle() {
    return pizzaIngredientStyle;
  }

}

package pizza;

import java.util.ArrayList;
import java.util.List;

import pizzaIngredient.PizzaIngrdientFactory;
import pizzaIngredient.PizzaIngredient;
import pizzaIngredient.PizzaIngredientType;

public abstract class Pizza {
  PizzaIngrdientFactory pizzaIngrdientFactory;
  PizzaType pizzaType;
  List<PizzaIngredient> pizzaIngredientList = new ArrayList<PizzaIngredient>();

  public Pizza(PizzaIngrdientFactory pizzaIngrdientFactory) {
    this.pizzaIngrdientFactory = pizzaIngrdientFactory;
  }

  public void prepare() {
    pizzaIngredientList.add(pizzaIngrdientFactory.createIngredient(PizzaIngredientType.SAUCE));
    pizzaIngredientList.add(pizzaIngrdientFactory.createIngredient(PizzaIngredientType.DOUGH));
  };

  public void bake() {
    printIngredients();
    System.out.println("bake " + this.pizzaType);
  }

  public void cut() {
    System.out.println("cut " + this.pizzaType);
  };

  public void box() {
    System.out.println("box " + this.pizzaType);
  };

  public void printIngredients() {
    pizzaIngredientList.stream().forEach(i -> {
      System.out.println("[" + i.getPizzaIngredientStyle().name() + "] " + i.getPizzaIngredientType().name());
    });
  }

  // getter
  public PizzaType getPizzaType() {
    return pizzaType;
  }
}

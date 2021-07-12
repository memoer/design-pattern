public class PizzaStore {
  private PizzaFactory pizzaFactory = new PizzaFactory();

  public Pizza orderPizza(PizzaType type) {
    Pizza pizza = pizzaFactory.createPizza(type);
    pizza.prepare();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}

public class PizzaFactory {
  public Pizza createPizza(PizzaType type) {
    Pizza pizza = null;
    switch (type) {
      case CHEESE:
        pizza = new CheesePizza();
        break;
      case CALM:
        pizza = new CalmPizza();
        break;
      case VEGGIE:
        pizza = new VeggiePizza();
        break;
      default:
        throw new Error("None Pizza Type");
    }
    return pizza;
  }
}

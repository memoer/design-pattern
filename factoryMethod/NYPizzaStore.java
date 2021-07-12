public class NYPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(PizzaType type) {
    Pizza pizza = null;
    switch (type) {
      case CHEESE:
        pizza = new NYCheesePizza();
        break;
      case CALM:
        pizza = new NYCalmPizza();
        break;
      case VEGGIE:
        pizza = new NYVeggiePizza();
        break;
      default:
        throw new Error("None Pizza Type");
    }
    return pizza;
  }
}

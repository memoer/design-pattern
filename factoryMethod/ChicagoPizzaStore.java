public class ChicagoPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(PizzaType type) {
    Pizza pizza = null;
    switch (type) {
      case CHEESE:
        pizza = new ChicagoCheesePizza();
        break;
      case CALM:
        pizza = new ChicagoCalmPizza();
        break;
      case VEGGIE:
        pizza = new ChicagoVeggiePizza();
        break;
      default:
        throw new Error("None Pizza Type");
    }
    return pizza;
  }
}

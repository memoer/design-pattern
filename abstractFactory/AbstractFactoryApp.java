import pizza.PizzaType;
import pizzaStore.ChicagoPizzaStore;
import pizzaStore.NYPizzaStore;

public class AbstractFactoryApp {
  public static void main(String[] args) {
    NYPizzaStore nyPizzaStore = new NYPizzaStore();
    ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    nyPizzaStore.orderPizza(PizzaType.CHEESE);
    chicagoPizzaStore.orderPizza(PizzaType.CLAM);
  }
}

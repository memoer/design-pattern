public class FactoryMethodApp {
  public static void main(String[] args) throws Exception {
    NYPizzaStore nyPizzaStore = new NYPizzaStore();
    ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    nyPizzaStore.orderPizza(PizzaType.CHEESE);
    nyPizzaStore.orderPizza(PizzaType.VEGGIE);
    nyPizzaStore.orderPizza(PizzaType.CALM);
    chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
    chicagoPizzaStore.orderPizza(PizzaType.VEGGIE);
    chicagoPizzaStore.orderPizza(PizzaType.CALM);
  }
}

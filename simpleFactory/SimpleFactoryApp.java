public class SimpleFactoryApp {
  public static void main(String[] args) throws Exception {
    PizzaStore pizzaStore = new PizzaStore();
    Pizza pizzaA = pizzaStore.orderPizza(PizzaType.CHEESE);
    Pizza pizzaB = pizzaStore.orderPizza(PizzaType.CALM);
    System.out.println(pizzaA.getName());
    System.out.println(pizzaB.getName());
  }
}

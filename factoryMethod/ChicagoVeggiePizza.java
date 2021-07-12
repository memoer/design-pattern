public class ChicagoVeggiePizza extends Pizza {

  public ChicagoVeggiePizza() {
    name = "ChicagoVeggiePizza";
  }

  @Override
  public void prepare() {
    System.err.println("Prepare ChicagoVeggiePizza");
  }

  @Override
  public void cut() {
    System.err.println("Cut ChicagoVeggiePizza");
  }

  @Override
  public void box() {
    System.err.println("Box ChicagoVeggiePizza");
  }
}

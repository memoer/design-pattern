public class ChicagoCheesePizza extends Pizza {
  public ChicagoCheesePizza() {
    this.name = "ChicagoCheesePizza";
  }

  @Override
  public void prepare() {
    System.err.println("Prepare ChicagoCheesePizza");
  }

  @Override
  public void cut() {
    System.err.println("Cut ChicagoCheesePizza");
  }

  @Override
  public void box() {
    System.err.println("Box ChicagoCheesePizza");
  }
}

public class ChicagoCalmPizza extends Pizza {
  public ChicagoCalmPizza() {
    name = "ChicagoCalmPizza";
  }

  @Override
  public void prepare() {
    System.err.println("Prepare ChicagoCalmPizza");
  }

  @Override
  public void cut() {
    System.err.println("Cut ChicagoCalmPizza");
  }

  @Override
  public void box() {
    System.err.println("Box ChicagoCalmPizza");
  }
}

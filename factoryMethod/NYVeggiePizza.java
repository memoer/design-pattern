public class NYVeggiePizza extends Pizza {

  public NYVeggiePizza() {
    name = "NYVeggiePizza";
  }

  @Override
  public void prepare() {
    System.err.println("Prepare NYVeggiePizza");
  }

  @Override
  public void cut() {
    System.err.println("Cut NYVeggiePizza");
  }

  @Override
  public void box() {
    System.err.println("Box NYVeggiePizza");
  }
}

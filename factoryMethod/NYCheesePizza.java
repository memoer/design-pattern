public class NYCheesePizza extends Pizza {
  public NYCheesePizza() {
    this.name = "NYCheesePizza";
  }

  @Override
  public void prepare() {
    System.err.println("Prepare NYCheesePizza");
  }

  @Override
  public void cut() {
    System.err.println("Cut NYCheesePizza");
  }

  @Override
  public void box() {
    System.err.println("Box NYCheesePizza");
  }
}

public class NYCalmPizza extends Pizza {
  public NYCalmPizza() {
    name = "NYCalmPizza";
  }

  @Override
  public void prepare() {
    System.err.println("Prepare NYCalmPizza");
  }

  @Override
  public void cut() {
    System.err.println("Cut NYCalmPizza");
  }

  @Override
  public void box() {
    System.err.println("Box NYCalmPizza");
  }
}

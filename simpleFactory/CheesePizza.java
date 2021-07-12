public class CheesePizza implements Pizza {
  private String name;

  public CheesePizza() {
    name = "CheesePizza";
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void prepare() {
    System.err.println("Prepare CheesePizza");
  }

  @Override
  public void cut() {
    System.err.println("Cut CheesePizza");
  }

  @Override
  public void box() {
    System.err.println("Box CheesePizza");
  }
}

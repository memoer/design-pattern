public class CalmPizza implements Pizza {
  private String name;

  public CalmPizza() {
    name = "CalmPizza";
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void prepare() {
    System.err.println("Prepare CalmPizza");
  }

  @Override
  public void cut() {
    System.err.println("Cut CalmPizza");
  }

  @Override
  public void box() {
    System.err.println("Box CalmPizza");
  }
}

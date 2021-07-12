public class VeggiePizza implements Pizza {
  private String name;

  public VeggiePizza() {
    name = "VeggiePizza";
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void prepare() {
    System.err.println("Prepare VeggiePizza");
  }

  @Override
  public void cut() {
    System.err.println("Cut VeggiePizza");
  }

  @Override
  public void box() {
    System.err.println("Box VeggiePizza");
  }
}

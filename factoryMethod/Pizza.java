public abstract class Pizza {
  public String name;

  public String getName() {
    return this.name;
  };

  public abstract void prepare();

  public abstract void cut();

  public abstract void box();
}

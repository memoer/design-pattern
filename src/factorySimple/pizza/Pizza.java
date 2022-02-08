package factorySimple.pizza;

public abstract class Pizza {
  String name;

  public Pizza(String name) {
    this.name = name;
  }

  public void prepare() {
    System.out.println(name + " >> prepare");
  }

  public void bake() {
    System.out.println(name + " >> bake");
  }

  public void cut() {
    System.out.println(name + " >> cut");
  }
}

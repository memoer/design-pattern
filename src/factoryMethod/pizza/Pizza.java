package factoryMethod.pizza;

public abstract class Pizza {
  String type;
  String name;

  public Pizza(String type, String name) {
    this.type = type;
    this.name = name;
  }

  public void prepare() {
    System.out.println("[" + type + "]" + name + " >> prepare");
  }

  public void bake() {
    System.out.println("[" + type + "]" + name + " >> bake");
  }

  public void cut() {
    System.out.println("[" + type + "]" + name + " >> cut");
  }
}

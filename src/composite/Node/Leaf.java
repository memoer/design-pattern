package composite.Node;

public class Leaf extends Component {
  String name;
  String description;
  boolean vegetarian;
  double price;

  public Leaf(String name, String description, boolean vegetarian, double price) {
    this.name = name;
    this.description = description;
    this.vegetarian = vegetarian;
    this.price = price;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public boolean isVegetarian() {
    return vegetarian;
  }

  @Override
  public Double getPrice() {
    return price;
  }

  @Override
  public void print() {
    System.out.print(getName());
    if (isVegetarian()) {
      System.out.print("(v)");
    }
    System.out.println(", " + getPrice());
    System.out.println(" >> " + getDescription());
  }

}

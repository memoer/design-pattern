package decorator.beverage;

public abstract class Beverage {
  public String description = "description";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}

package composite.Node;

public abstract class Component {
  public void add(Component component) {
    throw new UnsupportedOperationException();
  }

  public void remove(Component component) {
    throw new UnsupportedOperationException();
  }

  public Component getChild(int i) {
    throw new UnsupportedOperationException();
  }

  public String getName() {
    throw new UnsupportedOperationException();
  }

  public String getDescription() {
    throw new UnsupportedOperationException();
  }

  public Double getPrice() {
    throw new UnsupportedOperationException();
  }

  public boolean isVegetarian() {
    throw new UnsupportedOperationException();
  }

  public void print() {
    throw new UnsupportedOperationException();
  }

}

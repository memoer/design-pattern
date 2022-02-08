package composite.Node;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
  List<Component> child = new ArrayList<>();
  String name;
  String description;

  public Composite(String name, String description) {
    this.name = name;
    this.description = description;
  }

  @Override
  public void add(Component component) {
    child.add(component);
  }

  @Override
  public void remove(Component component) {
    child.remove(component);
  }

  @Override
  public Component getChild(int i) {
    return child.get(i);
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
  public void print() {
    System.out.println();
    System.out.println(getName() + ", " + getDescription());
    System.out.println("-------------------");
    for (Component component : child) {
      component.print();
    }
  }

}

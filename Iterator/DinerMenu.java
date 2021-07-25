import java.util.Iterator;

public class DinerMenu implements Menu {
  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;
  MenuItem[] menuItems;

  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("1", "a", true, 2.99);
    addItem("2", "b", false, 2.99);
    addItem("3", "c", false, 3.29);
    addItem("4", "d", false, 3.05);
  }

  @Override
  public void addItem(String name, String description, boolean vegetarian, double price) {
    if (numberOfItems >= MAX_ITEMS) {
      System.err.println("No");
    } else {
      MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
      menuItems[numberOfItems++] = menuItem;
    }
  }

  @Override
  public Iterator<MenuItem> cIterator() {
    return new DinerMenuIterator(menuItems);
  }
}

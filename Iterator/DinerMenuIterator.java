import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
  private MenuItem[] menuItems;
  private int position = 0;

  public DinerMenuIterator(MenuItem[] menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public MenuItem next() {
    return menuItems[position++];
  }

  @Override
  public boolean hasNext() {
    return position < menuItems.length && menuItems[position] != null;
  }
}

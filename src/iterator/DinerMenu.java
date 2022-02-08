package iterator;

public class DinerMenu implements Aggregate<String> {
  String[] items;

  public DinerMenu() {
    items = new String[] { "123", "234", "345" };
  }

  @Override
  public Iterator<String> createIterator() {
    return new DinerMenuIterator(items);
  }
}

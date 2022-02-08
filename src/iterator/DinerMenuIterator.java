package iterator;

public class DinerMenuIterator implements Iterator<String> {
  String[] items;
  int position = 0;

  public DinerMenuIterator(String[] items) {
    this.items = items;
  }

  @Override
  public String next() {
    return items[position++];
  }

  @Override
  public boolean hasNext() {
    if (position >= items.length || items[position] == null) {
      return false;
    } else {
      return true;
    }
  }
}

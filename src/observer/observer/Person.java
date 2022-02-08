package observer.observer;

public class Person implements Observer {
  String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public void update(String what) {
    System.out.println("(" + name + ") " + what);
  }
}

package observer;

import observer.observer.Person;
import observer.subject.Alarm;

public class Main {
  public static void main(String[] args) {
    Alarm alarm = new Alarm();
    Person[] pList = { new Person("1"), new Person("2"), new Person("3") };
    for (Person p : pList) {
      alarm.addObserver(p);
    }
    alarm.setWhat("youtube");
  }
}

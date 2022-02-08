package observer.subject;

import java.util.ArrayList;
import java.util.List;

import observer.observer.Observer;

public class Alarm implements Subject {
  private List<Observer> observers;
  private String what;

  public Alarm() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void addObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int idx = observers.indexOf(o);
    if (idx >= 0) {
      observers.remove(idx);
    }
  }

  @Override
  public void notifyObserver() {
    for (Observer o : observers) {
      o.update(what);
    }
  }

  private void changedWhat() {
    notifyObserver();
  }

  public void setWhat(String what) {
    this.what = what;
    changedWhat();
  }
}

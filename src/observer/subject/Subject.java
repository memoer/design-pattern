package observer.subject;

import observer.observer.Observer;

public interface Subject {
  public void addObserver(Observer o);

  public void removeObserver(Observer o);

  public void notifyObserver();
}

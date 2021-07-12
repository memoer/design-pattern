import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements Subject {
  private List<Observer> observers = new ArrayList<Observer>();
  private float temp;
  private float humidity;
  private float pressure;

  @Override
  public void addObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyToObservers() {
    for (Observer o : observers) {
      o.update(temp, humidity, pressure);
    }
  }

  public void changeData(float temp, float humidity, float pressure) {
    setTemp(temp);
    setHumidity(humidity);
    setPressure(pressure);
    notifyToObservers();
  }

  // get / set
  public float getTemp() {
    return temp;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void setTemp(float temp) {
    this.temp = temp;
  }

  public void setHumidity(float humidity) {
    this.humidity = humidity;
  }

  public void setPressure(float pressure) {
    this.pressure = pressure;
  }
}

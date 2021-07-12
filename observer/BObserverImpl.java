public class BObserverImpl implements Observer, DisplayElement {
  private float humidity;
  private float pressure;

  @Override
  public void printStatus() {
    System.err.println(" ---- ----- ---- ---- ---- ");
    System.out.println("B Observer updated");
    System.out.println("temp: " + this.humidity + " / humidity: " + this.pressure);
    System.err.println(" ---- ----- ---- ---- ---- ");
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.humidity = humidity;
    this.pressure = pressure;
    printStatus();
  }
}

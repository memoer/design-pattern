public class AObserverImpl implements Observer, DisplayElement {
  private float temp;
  private float humidity;

  @Override
  public void printStatus() {
    System.err.println(" ---- ----- ---- ---- ---- ");
    System.out.println("A Observer updated");
    System.out.println("temp: " + this.temp + " / humidity: " + this.humidity);
    System.err.println(" ---- ----- ---- ---- ---- ");
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    printStatus();
  }
}

public class ObserverApp {
  public static void main(String[] args) {
    WeatherDataSubject wds = new WeatherDataSubject();
    AObserverImpl aOb = new AObserverImpl();
    BObserverImpl bOb = new BObserverImpl();
    wds.addObserver(aOb);
    wds.addObserver(bOb);
    wds.changeData(80f, 65f, 30.4f);
  }
}

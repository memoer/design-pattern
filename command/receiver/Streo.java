package receiver;

// Receiver
public class Streo {
  private String where;

  public Streo(String where) {
    this.where = where;
  }

  public void on() {
    System.out.println(where + " Streo is on");
  }

  public void off() {
    System.out.println(where + " Streo is off");
  }

  public void setCD() {
    System.out.println(where + " Streo is set for CD input");
  }

  public void setVolume(int number) {
    System.out.println(where + " Streo volume set to " + number);
  }
}

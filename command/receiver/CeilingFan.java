package receiver;

// Receiver
public class CeilingFan {
  private String where;

  public CeilingFan(String where) {
    this.where = where;
  }

  public void on() {
    System.out.println(where + " ceiling fan is on high");
  }

  public void off() {
    System.out.println(where + " ceiling fan is off");
  }
}

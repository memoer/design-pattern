package receiver;

// Receiver
public class Light {
  private String what;

  public Light(String what) {
    this.what = what;
  }

  public void on() {
    System.out.println(what + " light is on");
  }

  public void off() {
    System.out.println(what + " light is off");
  }

}

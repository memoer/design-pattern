package command.receiver;

public class Light implements Receiver {
  @Override
  public void on() {
    System.out.println("Light On");
  }

  @Override
  public void off() {
    System.out.println("Light Off");
  }
}

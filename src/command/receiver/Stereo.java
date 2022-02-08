package command.receiver;

public class Stereo implements Receiver {
  @Override
  public void on() {
    System.out.println("Stereo On");
  }

  @Override
  public void off() {
    System.out.println("Stereo Off");
  }
}

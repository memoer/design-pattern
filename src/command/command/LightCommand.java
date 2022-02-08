package command.command;

import command.receiver.Light;
import command.receiver.Receiver;

public class LightCommand implements Command {
  Receiver r;

  public LightCommand() {
    this.r = new Light();
  }

  @Override
  public void exeucte() {
    r.on();
  }

  @Override
  public void undo() {
    r.off();
  }
}

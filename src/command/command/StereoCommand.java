package command.command;

import command.receiver.Receiver;
import command.receiver.Stereo;

public class StereoCommand implements Command {
  Receiver r;

  public StereoCommand() {
    r = new Stereo();
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

package command;

import receiver.Streo;

// Command
public class StreoOnWithCDCommand implements ICommand {
  private Streo streo;

  public StreoOnWithCDCommand(Streo streo) {
    this.streo = streo;
  }

  @Override
  public void execute() {
    streo.on();
    streo.setCD();
    streo.setVolume(11);
  }

  @Override
  public void undo() {
    streo.off();
  }
}

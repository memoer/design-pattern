package command;

import receiver.Streo;

// Command
public class StreoOffCommand implements ICommand {
  private Streo streo;

  public StreoOffCommand(Streo streo) {
    this.streo = streo;
  }

  @Override
  public void execute() {
    streo.off();
  }

  @Override
  public void undo() {
    streo.on();
  }
}

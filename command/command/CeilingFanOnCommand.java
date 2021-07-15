package command;

import receiver.CeilingFan;

// Command
public class CeilingFanOnCommand implements ICommand {
  private CeilingFan ceilingFan;

  public CeilingFanOnCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    ceilingFan.on();
  }
}

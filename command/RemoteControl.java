import command.ICommand;
import command.NoCommand;

// Invoker
public class RemoteControl {
  private ICommand[] onCommands;
  private ICommand[] offCommands;
  private ICommand undoCommand;

  public RemoteControl() {
    onCommands = new ICommand[7];
    offCommands = new ICommand[7];
    for (int i = 0; i < 7; i++) {
      onCommands[i] = new NoCommand();
      offCommands[i] = new NoCommand();
    }
    undoCommand = new NoCommand();
  }

  public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    ICommand command = onCommands[slot];
    command.execute();
    undoCommand = command;
  }

  public void offButtonWasPushed(int slot) {
    ICommand command = onCommands[slot];
    command.execute();
    undoCommand = command;
  }

  public void undoButtonWasPushed() {
    this.undoCommand.undo();
  }
}

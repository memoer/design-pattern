import command.ICommand;
import command.NoCommand;

// Invoker
public class RemoteControl {
  ICommand[] onCommands;
  ICommand[] offCommands;

  public RemoteControl() {
    onCommands = new ICommand[7];
    offCommands = new ICommand[7];
    for (int i = 0; i < 7; i++) {
      onCommands[i] = new NoCommand();
      offCommands[i] = new NoCommand();
    }
  }

  public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
  }
}

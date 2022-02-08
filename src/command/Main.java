package command;

import command.command.Command;
import command.command.LightCommand;
import command.command.StereoCommand;
import command.invoker.Invoker;

public class Main {
  public static void main(String[] args) {
    Invoker invoker = new Invoker();
    Command lightCommand = new LightCommand();
    Command stereoCommand = new StereoCommand();

    invoker.setCommand(lightCommand);
    invoker.onButton();
    invoker.setCommand(stereoCommand);
    invoker.onButton();
    invoker.offButton();
  }
}

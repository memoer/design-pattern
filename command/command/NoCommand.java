package command;

// Command
public class NoCommand implements ICommand {
  @Override
  public void execute() {
    System.out.println("No Command");
  }
}

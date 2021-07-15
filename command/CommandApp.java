import command.CeilingFanOffCommand;
import command.CeilingFanOnCommand;
import command.LightOffCommand;
import command.LightOnCommand;
import command.StreoOffCommand;
import command.StreoOnWithCDCommand;
import receiver.CeilingFan;
import receiver.Light;
import receiver.Streo;

public class CommandApp {
  public static void main(String[] args) {
    // Invoker
    RemoteControl remoteControl = new RemoteControl();
    // Receiver
    CeilingFan ceilingFan = new CeilingFan("Living Room");
    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    Streo streo = new Streo("Living Room");
    // Command
    LightOnCommand livingLightOnCommand = new LightOnCommand(livingRoomLight);
    LightOffCommand livingLightOffCommand = new LightOffCommand(livingRoomLight);
    LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
    CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
    StreoOnWithCDCommand streoOnWithCDCommand = new StreoOnWithCDCommand(streo);
    StreoOffCommand streoOffCommand = new StreoOffCommand(streo);
    //
    remoteControl.setCommand(0, livingLightOnCommand, livingLightOffCommand);
    remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
    remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
    remoteControl.setCommand(3, streoOnWithCDCommand, streoOffCommand);

    for (int i = 0; i < 5; i++) {
      remoteControl.onButtonWasPushed(i);
      remoteControl.offButtonWasPushed(i);
    }
  }
}

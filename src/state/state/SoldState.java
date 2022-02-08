package state.state;

import state.Machine;

public class SoldState implements State {
  Machine machine;

  public SoldState(Machine machine) {
    this.machine = machine;
  }

  @Override
  public void insertCoin() {
    System.out.println("Noop");
  }

  @Override
  public void ejectCoin() {
    System.out.println("Noop");
  }

  @Override
  public void turnCrank() {
    System.out.println("Noop");
  }

  @Override
  public void out() {
    int count = machine.despense();
    if (count > 0) {
      machine.setState("noCoin");
    } else {
      machine.setState("soldOut");
    }
  }
}

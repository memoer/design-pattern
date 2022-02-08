package state.state;

import state.Machine;

public class NoCoinState implements State {
  Machine machine;

  public NoCoinState(Machine machine) {
    this.machine = machine;
  }

  @Override
  public void insertCoin() {
    System.out.println("동전을 넣었습니다.");
    machine.setState("hasCoin");
  }

  @Override
  public void ejectCoin() {
    System.out.println("동전이 없습니다.");
  }

  @Override
  public void turnCrank() {
    System.out.println("동전을 넣어주세요");
  }

  @Override
  public void out() {
    System.out.println("Noop");
  }
}

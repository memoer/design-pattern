package state.state;

import state.Machine;

public class HasCoinState implements State {
  Machine machine;

  public HasCoinState(Machine machine) {
    this.machine = machine;
  }

  @Override
  public void insertCoin() {
    System.out.println("이미 동전을 넣었습니다.");
  }

  @Override
  public void ejectCoin() {
    System.out.println("동전을 뺍니다.");
    machine.setState("noCoin");
  }

  @Override
  public void turnCrank() {
    System.out.println("손잡이를 돌립니다.");
    machine.setState("sold");
  }

  @Override
  public void out() {
    System.out.println("Noop");
  }
}

package state.state;

import state.Machine;

public class SoldOutState implements State {
  Machine machine;

  public SoldOutState(Machine machine) {
    this.machine = machine;
  }

  @Override
  public void insertCoin() {
    System.out.println("알맹이 매진");
  }

  @Override
  public void ejectCoin() {
    System.out.println("알맹이 매진");
  }

  @Override
  public void turnCrank() {
    System.out.println("알맹이 매진");
  }

  @Override
  public void out() {
    System.out.println("알맹이 매진");
  }
}

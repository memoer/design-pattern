package state;

import state.state.HasCoinState;
import state.state.NoCoinState;
import state.state.SoldOutState;
import state.state.SoldState;
import state.state.State;

public class Machine {
  State soldOut;
  State noCoin;
  State hasCoin;
  State sold;
  State state;
  int count = 1;

  public Machine() {
    soldOut = new SoldOutState(this);
    noCoin = new NoCoinState(this);
    hasCoin = new HasCoinState(this);
    sold = new SoldState(this);
    state = noCoin;
  }

  public void setState(String type) {
    switch (type) {
      case "soldOut":
        this.state = this.soldOut;
        break;
      case "noCoin":
        this.state = this.noCoin;
        break;
      case "hasCoin":
        this.state = this.hasCoin;
        break;
      case "sold":
        this.state = this.sold;
        break;
      default:
        throw new IllegalArgumentException();
    }
  }

  public void insertCoin() {
    state.insertCoin();
  }

  public void ejectCoin() {
    state.ejectCoin();
  }

  public void turnCrank() {
    state.turnCrank();
    if (state == sold) {
      state.out();
    }
  }

  public int despense() {
    if (count > 0) {
      System.out.println("알맹이가 나가고 있습니다.");
      this.count -= 1;
      return this.count;
    } else {
      System.out.println("알맹이가 없습니다.");
      return this.count;
    }
  }

}

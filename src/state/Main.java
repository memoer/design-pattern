package state;

public class Main {
  public static void main(String[] args) {
    Machine m = new Machine();

    m.turnCrank();
    m.insertCoin();
    m.turnCrank();
    m.turnCrank();
  }

}

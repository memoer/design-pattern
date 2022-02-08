package strategy;

import strategy.Attack.BackAttack;
import strategy.Attack.MagicAttack;

public class Main {
  public static void main(String[] args) {
    Person p = new Person(new BackAttack());
    p.attack();
    p.setAttack(new MagicAttack());
    p.attack();
  }
}

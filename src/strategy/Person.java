package strategy;

import strategy.Attack.Attack;

public class Person {
  private Attack attack;

  public Person(Attack attack) {
    this.attack = attack;
  }

  public void setAttack(Attack attack) {
    this.attack = attack;
  }

  public void attack() {
    System.out.println(attack.attack());
  }
}

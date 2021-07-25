public abstract class CaffeineBeverage {
  // template method
  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
    hook();
  }

  public final void boilWater() {

  }

  public final void pourInCup() {

  }

  public abstract void brew();

  public abstract void addCondiments();

  public void hook() {
  };
}

public class Tea extends CaffeineBeverage {
  @Override
  public void brew() {
    System.out.println("물 끓이는 중");
  }

  @Override
  public void addCondiments() {
    System.out.println("레몬을 추가하는 중");
  }
}

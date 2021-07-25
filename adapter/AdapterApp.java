public class AdapterApp {
  public static void main(String[] args) {
    // Duck을 사용, 하지만 클라이언트에선 Turkey를 요청 [ WildTurkey ]
    // 이를 Duck클래스처럼 동작하게 해준다.
    Duck turkeyAdapter = new TurkeyAdapter(new WildTurkey());
    turkeyAdapter.quack();
    turkeyAdapter.fly();
  }
}

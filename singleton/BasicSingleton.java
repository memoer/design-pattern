public class BasicSingleton {
  private static BasicSingleton basicSingleton = null;

  private BasicSingleton() {
  }

  public static BasicSingleton getInstance() {
    if (basicSingleton == null) {
      basicSingleton = new BasicSingleton();
    }
    return basicSingleton;
  }
}

public class TemplateMethodApp {
  public static void main(String[] args) {
    Coffee coffee = new Coffee();
    Tea tea = new Tea();
    coffee.prepareRecipe();
    tea.prepareRecipe();
  }
}

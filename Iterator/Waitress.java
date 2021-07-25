import java.util.Iterator;

public class Waitress {
  private Menu pancakeHouseMenu;
  private Menu dinerMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    Iterator<MenuItem> pIterator = pancakeHouseMenu.cIterator();
    Iterator<MenuItem> dIterator = dinerMenu.cIterator();
    System.out.println("아침 메뉴");
    printMenu(pIterator);
    System.out.println("저녁 메뉴");
    printMenu(dIterator);
  }

  public void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + " -- " + menuItem.getDescription());
    }
  }
}

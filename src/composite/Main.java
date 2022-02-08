package composite;

import composite.Node.Component;
import composite.Node.Leaf;
import composite.Node.Composite;

public class Main {
  public static void main(String[] args) {
    Component root = new Composite("전체 메뉴", "전체 메뉴");
    Component breakfastMenu = new Composite("팬케이크 하우스 메뉴", "아침 메뉴");
    Component lunchMenu = new Composite("객체마을 식당 메뉴", "점심 메뉴");
    Component dinerMenu = new Composite("카페 메뉴", "저녁 메뉴");
    Component dessertMenu = new Composite("디저트 메뉴", "디저트를 즐겨보세요!");

    root.add(breakfastMenu);
    root.add(lunchMenu);
    root.add(dinerMenu);
    dinerMenu.add(new Leaf("파스타", "마리나라 소스 스파게티. 효모빵도 드립니다.", true, 3.89));
    dinerMenu.add(dessertMenu);
    dessertMenu.add(new Leaf("애플 파이", "바삭바삭", true, 1.59));

    root.print();
  }
}

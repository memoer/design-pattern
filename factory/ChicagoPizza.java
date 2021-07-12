package factory;

public class ChicagoPizza extends Pizza{
//    OCP -> 변경에는 닫혀있고, 확장에 열려있다.
//    아래와 같은 코드는 변경에 열려져있고, 확장에 닫혀져 있는 구조가 됨
//    기존 타입 제거 (or) 새 타입 추가 -> 코드 변경 필수
    @Override
    protected void addToppings(String name) {
        if ("cheese".equals(name)){
            this.basicToppings(new String[]{"Shredded Mozzarella Cheese"});
        }else if ("clam".equals(name)){
            this.basicToppings(new String[]{"Shredded Mozzarella Cheese", "Frozen Clams from Chesapeake Bay"});
        }else if ("pepperoni".equals(name)){
            this.basicToppings(new String[]{"Shredded Mozzarella Cheese","Black Olives","Spinach","Eggplant","Sliced Pepperoni"});
        }else if ("veggie".equals(name)){
            this.basicToppings(new String[]{"Shredded Mozzarella Cheese","Black Olives","Spinach","Eggplant"});
        }
    }

    public ChicagoPizza(String name) {
        super("Chicago Style Deep Dish "+name+" Pizza","Extra Thick Crust Dough","Plum Tomato Sauce");
        this.addToppings(name);
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

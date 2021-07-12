package factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();
    public Pizza(String name,String dough, String sauce){
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
    }
    public String getName(){
        return this.name;
    }
    public void prepare(){
        System.out.println("Preparing "+this.name);
    }
    public void bake(){
        System.out.println("Baking "+this.name);
    }
    public void cut(){
        System.out.println("Cutting "+this.name);
    }
    public void box(){
        System.out.println("Boxing "+this.name);
    }
    public String toString(){
//        문자열 추가나 변경등의 작업이 많을 경우에는 StringBuffer, 문자열 변경 작업이 거의 없는 경우에는 그냥 String 사용하는 것이 유리
        StringBuffer display = new StringBuffer();
        display.append("--- ").append(this.name).append(" ---\n");
        display.append(this.dough).append("\n");
        display.append(this.sauce).append("\n");
        for (String topping : this.toppings){
            display.append(topping + "\n");
        }
        return display.toString();
    }
    protected void basicToppings(String[] toppings){
        this.toppings.addAll(Arrays.asList(toppings));
    }
    protected abstract void addToppings(String name);
}

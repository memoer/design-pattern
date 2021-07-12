package factory;

public abstract class PizzaStore {
    private Pizza make(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public Pizza orderPizza(String type){
        Pizza pizza = this.createPizza(type);
        return this.make(pizza);
    }
    protected abstract Pizza createPizza(String type);
}

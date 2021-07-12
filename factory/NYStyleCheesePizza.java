package factory;

public class NYStyleCheesePizza extends Pizza{
    @Override
    protected void addToppings(String name) {
        if ("pepperoni".equals(name)){
            this.basicToppings(new String[]{
                    "Grated Reggiano Cheese",
                    "Sliced Pepperoni",
                    "Garlic",
                    "Onion",
                    "Mushrooms",
                    "Red Pepper",
            });
        } else if ("veggie".equals(name)){
            this.basicToppings(new String[]{
                    "Grated Reggiano Cheese",
                    "Garlic",
                    "Onion",
                    "Mushrooms",
                    "Red Pepper",
            });
        } else if ("clam".equals(name)){
            this.basicToppings(new String[]{
                    "Grated Reggiano Cheese",
                    "Fresh Clams from Long Island Sound"
            });
        } else if ("cheese".equals(name)){
            this.basicToppings(new String[]{
                    "Grated Reggiano Cheese"
            });
        }
    }

    public NYStyleCheesePizza(String name){
        super("NY Style Sauce and "+name+" Pizza","Thin Crust Dough","Marinara Sauce");
        this.addToppings(name);
    }
}

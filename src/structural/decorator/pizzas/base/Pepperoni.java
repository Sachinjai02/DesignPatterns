package structural.decorator.pizzas.base;

import structural.decorator.pizzas.Pizza;

public class Pepperoni implements Pizza {
    @Override
    public int getCost() {
        return 180;
    }

    @Override
    public String getDescription() {
        return "Pepperoni";
    }
}

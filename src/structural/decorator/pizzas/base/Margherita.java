package structural.decorator.pizzas.base;

import structural.decorator.pizzas.Pizza;

public class Margherita implements Pizza {
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Margherita";
    }
}

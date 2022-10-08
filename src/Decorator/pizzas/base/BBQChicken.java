package Decorator.pizzas.base;

import Decorator.pizzas.Pizza;

public class BBQChicken implements Pizza {
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "BBQChicken";
    }
}

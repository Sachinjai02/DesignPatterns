package Decorator.pizzas.toppings;

import Decorator.pizzas.Pizza;

public class Cheese implements Pizza {

    private Pizza base;

    public Cheese(Pizza base) {
        this.base = base;
    }

    @Override
    public int getCost() {
        return this.base.getCost() + 80;
    }

    @Override
    public String getDescription() {
        return this.base.getDescription() + " + Cheese";
    }
}

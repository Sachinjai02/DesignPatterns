package Decorator.pizzas.toppings;

import Decorator.pizzas.Pizza;

public class Paneer implements Pizza {

    private Pizza base;

    public Paneer(Pizza base) {
        this.base = base;
    }

    @Override
    public int getCost() {
        return this.base.getCost() + 60;
    }

    @Override
    public String getDescription() {
        return this.base.getDescription() + " + Paneer";
    }
}

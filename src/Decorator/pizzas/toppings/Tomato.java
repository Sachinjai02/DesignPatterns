package Decorator.pizzas.toppings;

import Decorator.pizzas.Pizza;

public class Tomato implements Pizza {

    private Pizza base;

    public Tomato(Pizza base) {
        this.base = base;
    }

    @Override
    public int getCost() {
        return this.base.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return this.base.getDescription() + " + Tomato";
    }
}

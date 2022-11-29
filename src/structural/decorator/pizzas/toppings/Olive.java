package structural.decorator.pizzas.toppings;

import structural.decorator.pizzas.Pizza;

public class Olive implements Pizza {

    private Pizza base;

    public Olive(Pizza base) {
        this.base = base;
    }

    @Override
    public int getCost() {
        return this.base.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return this.base.getDescription() + " + Olive";
    }
}

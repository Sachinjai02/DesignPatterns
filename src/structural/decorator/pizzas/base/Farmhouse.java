package structural.decorator.pizzas.base;

import structural.decorator.pizzas.Pizza;

public class Farmhouse implements Pizza {
    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Farmhouse";
    }
}

package structural.decorator.pizzas;

import structural.decorator.pizzas.base.BBQChicken;
import structural.decorator.pizzas.toppings.Cheese;
import structural.decorator.pizzas.toppings.Tomato;
import structural.decorator.pizzas.toppings.Paneer;

public class PizzaDemo {

    public static void main(String[] args) {
        Pizza p = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(p.getCost());
        System.out.println(p.getDescription());
    }
}

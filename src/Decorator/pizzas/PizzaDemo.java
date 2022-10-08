package Decorator.pizzas;

import Decorator.pizzas.base.BBQChicken;
import Decorator.pizzas.toppings.Cheese;
import Decorator.pizzas.toppings.Paneer;
import Decorator.pizzas.toppings.Tomato;

public class PizzaDemo {

    public static void main(String[] args) {
        Pizza p = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(p.getCost());
        System.out.println(p.getDescription());
    }
}

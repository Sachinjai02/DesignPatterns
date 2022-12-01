package structural.decorator.coffee;

public class CoffeeMaker {
    public static void main(String[] args) {
        Beverage latteCoffee =
                new Mocha(new Whip(new Milk(new HouseBlend())));
        System.out.println(latteCoffee.getDescription());
        System.out.println(latteCoffee.getCost());
    }
}

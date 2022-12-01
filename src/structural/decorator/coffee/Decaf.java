package structural.decorator.coffee;

public class Decaf implements Beverage {
    @Override
    public String getDescription() {
        return "Decaf Coffee";
    }

    @Override
    public int getCost() {
        return 110;
    }
}

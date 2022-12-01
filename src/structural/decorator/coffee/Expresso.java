package structural.decorator.coffee;

public class Expresso implements Beverage {
    @Override
    public String getDescription() {
        return "Expresso Coffee";
    }

    @Override
    public int getCost() {
        return 150;
    }
}

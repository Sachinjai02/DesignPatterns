package structural.decorator.coffee;

public class Milk implements Beverage {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + "Milk";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 10;
    }
}

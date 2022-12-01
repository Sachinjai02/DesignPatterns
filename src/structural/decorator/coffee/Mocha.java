package structural.decorator.coffee;

public class Mocha implements Beverage {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + "Mocha";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 20;
    }
}

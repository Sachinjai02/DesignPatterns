package structural.decorator.coffee;

public class Whip implements Beverage {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + "Whip";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 10;
    }
}

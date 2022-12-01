package structural.decorator.coffee;

public class Soy implements Beverage {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + "Soy";
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 15;
    }
}

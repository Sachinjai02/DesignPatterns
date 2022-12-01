package structural.decorator.coffee;

public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "HouseBlend Coffee";
    }

    @Override
    public int getCost() {
        return 90;
    }
}

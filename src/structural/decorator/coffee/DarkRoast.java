package structural.decorator.coffee;

public class DarkRoast implements Beverage {
    @Override
    public String getDescription() {
        return "DarkRoast Coffee";
    }

    @Override
    public int getCost() {
        return 100;
    }
}

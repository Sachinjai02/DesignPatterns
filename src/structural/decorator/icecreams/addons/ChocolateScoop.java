package structural.decorator.icecreams.addons;

import structural.decorator.icecreams.IceCreamConstituent;

public class ChocolateScoop implements IceCreamConstituent {
    private IceCreamConstituent base;

    public ChocolateScoop(IceCreamConstituent base) {
        this.base = base;
    }
    @Override
    public String getDescription() {
        return this.base.getDescription() + " + " + " Chocolate scoop";
    }

    @Override
    public Integer getCost() {
        return this.base.getCost() + 35;
    }
}

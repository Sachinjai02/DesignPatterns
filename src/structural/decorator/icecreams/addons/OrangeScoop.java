package structural.decorator.icecreams.addons;

import structural.decorator.icecreams.IceCreamConstituent;

public class OrangeScoop implements IceCreamConstituent {
    private IceCreamConstituent base;

    public OrangeScoop(IceCreamConstituent base) {
        this.base = base;
    }
    @Override
    public String getDescription() {
        return this.base.getDescription() + " + " + " Orange scoop";
    }

    @Override
    public Integer getCost() {
        return this.base.getCost() + 25;
    }
}

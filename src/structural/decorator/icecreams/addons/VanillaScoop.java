package structural.decorator.icecreams.addons;

import structural.decorator.icecreams.IceCreamConstituent;

public class VanillaScoop implements IceCreamConstituent {
    private IceCreamConstituent base;

    public VanillaScoop(IceCreamConstituent base) {
        this.base = base;
    }
    @Override
    public String getDescription() {
        return this.base.getDescription() + " + " + " Vanilla scoop";
    }

    @Override
    public Integer getCost() {
        return this.base.getCost() + 15;
    }
}

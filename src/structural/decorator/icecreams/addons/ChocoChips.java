package structural.decorator.icecreams.addons;

import structural.decorator.icecreams.IceCreamConstituent;

public class ChocoChips implements IceCreamConstituent {
    private IceCreamConstituent base;

    public ChocoChips(IceCreamConstituent base) {
        this.base = base;
    }
    @Override
    public String getDescription() {
        return this.base.getDescription() + " + " + " Choco chips";
    }

    @Override
    public Integer getCost() {
        return this.base.getCost() + 20;
    }
}

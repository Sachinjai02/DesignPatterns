package structural.decorator.icecreams.base;

import structural.decorator.icecreams.IceCreamConstituent;

public class VanillaCone implements IceCreamConstituent {
    @Override
    public String getDescription() {
        return "Vanilla Cone";
    }

    @Override
    public Integer getCost() {
        return 10;
    }
}

package structural.decorator.icecreams.base;

import structural.decorator.icecreams.IceCreamConstituent;

public class OrangeCone implements IceCreamConstituent {
    @Override
    public String getDescription() {
        return "Orange Cone";
    }

    @Override
    public Integer getCost() {
        return 20;
    }
}

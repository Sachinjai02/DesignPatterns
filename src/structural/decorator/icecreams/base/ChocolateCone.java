package structural.decorator.icecreams.base;

import structural.decorator.icecreams.IceCreamConstituent;

public class ChocolateCone implements IceCreamConstituent {
    @Override
    public String getDescription() {
        return "Chocolate Cone";
    }

    @Override
    public Integer getCost() {
        return 30;
    }
}

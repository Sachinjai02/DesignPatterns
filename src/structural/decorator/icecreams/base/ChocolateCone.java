package structural.decorator.icecreams.base;

import structural.decorator.icecreams.IceCreamConstituent;

public class ChocolateCone implements IceCreamConstituent {
    //Chocolate Cone acts as both base as well as addon.
    // i.e. Chocolate Cone can be put inside any other cone/constituent
    private IceCreamConstituent base;
    public ChocolateCone(IceCreamConstituent base) {
        this.base = base;
    }
    public ChocolateCone() {

    }
    @Override
    public String getDescription() {
        if(this.base != null) {
            return this.base.getDescription() + " + " + "Chocolate Cone";
        }
        return "Chocolate Cone";
    }

    @Override
    public Integer getCost() {
        if(this.base != null) {
            return this.base.getCost() + 30;
        }
        return 30;
    }
}

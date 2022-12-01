package structural.decorator.icecreams.client;

import structural.decorator.icecreams.IceCreamConstituent;
import structural.decorator.icecreams.addons.ChocoChips;
import structural.decorator.icecreams.addons.ChocolateScoop;
import structural.decorator.icecreams.addons.OrangeScoop;
import structural.decorator.icecreams.addons.VanillaScoop;
import structural.decorator.icecreams.base.VanillaCone;

public class Main {

    public static void main(String[] args) {
        IceCreamConstituent iceCream =
                new OrangeScoop(
                    new ChocoChips(
                            new VanillaScoop(
                                    new ChocolateScoop(
                                            new VanillaCone()))));

        System.out.println(iceCream.getDescription());
        System.out.println("Cost is " + iceCream.getCost());
    }
}

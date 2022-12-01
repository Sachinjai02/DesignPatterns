package behavioural.strategy.googlemaps.factory;

import behavioural.strategy.googlemaps.BikePathCalcStrategy;
import behavioural.strategy.googlemaps.CarPathCalcStrategy;
import behavioural.strategy.googlemaps.PathCalculationStrategy;
import behavioural.strategy.googlemaps.WalkPathCalcStrategy;

public class PathCalculationStrategyFactory {

    public static PathCalculationStrategy getPathCalculationStrategy(String mode) {
        if(mode.equalsIgnoreCase("walk")) {
            return new WalkPathCalcStrategy();
        } else if(mode.equalsIgnoreCase("bike")) {
            return new BikePathCalcStrategy();
        } else if(mode.equalsIgnoreCase("car")) {
            return new CarPathCalcStrategy();
        }
        return null;
    }
}

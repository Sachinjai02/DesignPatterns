package behavioural.strategy.googlemaps.factory;

import behavioural.strategy.googlemaps.BikeShortestDistanceCalcStrategy;
import behavioural.strategy.googlemaps.CarShortestDistanceCalcStrategy;
import behavioural.strategy.googlemaps.ShortestDistanceCalculationStrategy;
import behavioural.strategy.googlemaps.WalkShortestDistanceCalcStrategy;

public class DistanceStrategyFactory {

    public static ShortestDistanceCalculationStrategy getDistanceStrategy(String mode) {
        if(mode.equalsIgnoreCase("walk")) {
            return new WalkShortestDistanceCalcStrategy();
        } else if(mode.equalsIgnoreCase("bike")) {
            return new BikeShortestDistanceCalcStrategy();
        } else if(mode.equalsIgnoreCase("car")) {
            return new CarShortestDistanceCalcStrategy();
        }
        return null;
    }
}

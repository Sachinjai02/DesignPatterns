package behavioural.strategy.googlemaps.client;

import behavioural.strategy.googlemaps.ShortestDistanceCalculationStrategy;
import behavioural.strategy.googlemaps.factory.DistanceStrategyFactory;

public class Main {
    public static void main(String[] args) {
        ShortestDistanceCalculationStrategy shortestDistanceStrategy = DistanceStrategyFactory.getDistanceStrategy("car");
        shortestDistanceStrategy.getShortestDistance("Delhi", "Agra");
    }
}

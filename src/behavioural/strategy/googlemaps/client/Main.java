package behavioural.strategy.googlemaps.client;

import behavioural.strategy.googlemaps.PathCalculationStrategy;
import behavioural.strategy.googlemaps.factory.PathCalculationStrategyFactory;

public class Main {
    public static void main(String[] args) {
        PathCalculationStrategy shortestDistanceStrategy = PathCalculationStrategyFactory.getPathCalculationStrategy("car");
        shortestDistanceStrategy.findPath("Delhi", "Agra");
    }
}

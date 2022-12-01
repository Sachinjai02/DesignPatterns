package behavioural.strategy.googlemaps;

import behavioural.strategy.googlemaps.ShortestDistanceCalculationStrategy;

import java.util.ArrayList;
import java.util.List;

public class WalkShortestDistanceCalcStrategy implements ShortestDistanceCalculationStrategy {
    @Override
    public List<String> getShortestDistance(String from, String to) {
        return new ArrayList<>();
    }
}

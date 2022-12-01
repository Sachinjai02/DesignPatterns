package behavioural.strategy.googlemaps;

import java.util.List;

public interface ShortestDistanceCalculationStrategy {

    public List<String> getShortestDistance(String from, String to);
}

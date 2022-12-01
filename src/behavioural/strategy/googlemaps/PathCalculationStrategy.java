package behavioural.strategy.googlemaps;

import java.util.List;

public interface PathCalculationStrategy {

    public List<String> findPath(String from, String to);
}

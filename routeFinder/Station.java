package routeFinder;

import java.util.HashMap;
import java.util.Map;


public class Station {

    private String name;
    private Map<Station, Integer> destinations;

    public Station(String name) {
        this.name = name;
        destinations = new HashMap<>();
    }

    public Map getDestinations() {
        return destinations;
    }

    public void addDestination(Station station, Integer time) {
        destinations.put(station, time);
    }

    public String getName() {
        return name;
    }

    public int getTimeToStation(Station dest) {
        return destinations.containsKey(dest) ? destinations.get(dest) : -1;
    }

    @Override
    public String toString() {
        return name;
    }
}


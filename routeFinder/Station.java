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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Station station = (Station) o;

        if (!name.equals(station.name)) return false;
        return !(destinations != null ? !destinations.equals(station.destinations) : station.destinations != null);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return name;
    }
}


package routeFinder;

import java.util.HashSet;
import java.util.Set;

public class Route {
    public static final Route EMPTY = new Route();
    private int totalTime;
    private Set<Station> stops;

    public Route() {
        setTotalTime(0);
        stops = new HashSet<>();
    }


    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public void addTime(int time) {
        totalTime += time;
    }

    public Set<Station> getStops() {
        return stops;
    }

    public void add(Station stops) {
        this.stops.add(stops);
    }


    @Override
    public String toString() {
        String printStops = "Route takes " + totalTime + " minutes from: \n";
        for (Station st : stops) {
            printStops += st.getName() + " ";
        }

        return printStops;
    }
}

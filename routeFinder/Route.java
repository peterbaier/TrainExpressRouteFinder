package routeFinder;

import java.util.*;

public class Route {
    public static final Route EMPTY = new Route();
    private int totalTime;
    private List<Station> stops;


    public Route() {
        setTotalTime(0);
        stops = new LinkedList<>();
    }

    public Route(Route r) {
        this.totalTime = r.getTotalTime();
        this.stops = r.getStops();
    }

    public void reset() {
        this.totalTime = 0;
        this.stops.clear();
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

    public List<Station> getStops() {
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

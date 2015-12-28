package routeFinder;

import java.util.HashMap;
import java.util.Map;


public class StationManager {
    private Map<String,Station> stations;
    static Station A = new Station("A");
    static Station B = new Station("B");
    static Station C = new Station("C");
    static Station D = new Station("D");
    static Station E = new Station("E");

    public StationManager() {
        stations =  new HashMap<>();
        addNewStation(A);
        A.addDestination(B,3);
        A.addDestination(D,6);
        addNewStation(B);
        B.addDestination(A,3);
        B.addDestination(C,7);
        addNewStation(C);
        C.addDestination(D,8);
        C.addDestination(E,3);
        addNewStation(D);
        D.addDestination(B,5);
        D.addDestination(C,9);
        D.addDestination(E,9);
        addNewStation(E);
        E.addDestination(D,9);

    }

    protected void addNewStation(Station newStation){
        stations.put(newStation.getName(),newStation);
    }


    protected Map<String,Station> getStations(){
        return stations;
    }


}


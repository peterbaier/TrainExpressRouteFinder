package routeFinder;

import java.util.ArrayList;
import java.util.List;

public class Search {

    private List<Route> rlist = new ArrayList<>();

    private void getFastestRoute(Station src, Station dest, Station prev, Route temp) {

        temp.add(src);
        temp.addTime(prev.getTimeToStation(src));
        if (src.getTimeToStation(dest) > 0) {
            temp.add(dest);
            temp.addTime(src.getTimeToStation(dest));

        } else {
            src.getDestinations().keySet().forEach(st -> {
                if (temp.getStops().contains(st)) return;
                getFastestRoute(st, dest, src, temp);
            });
        }
        Route current = new Route();
        current.getStops().addAll(temp.getStops());
        current.setTotalTime(temp.getTotalTime());
        rlist.add(current);

        temp.reset();
    }

    public Route search(Station src, Station dest) {
        if(src != dest) {
            getFastestRoute(src, dest, src, Route.EMPTY);
            Route result = Route.EMPTY;
            for (Route route : rlist) {
                if (result == Route.EMPTY) result = route;
                if (route.getStops().contains(dest) && route.getTotalTime() != 0 && route.getTotalTime() < result.getTotalTime())
                    result = route;
            }
            return result;
        }
        return Route.EMPTY;
    }


//    public Route getFastestRoute(Station src, Station dest, Station prev, Route currentFastest) {
//        Route current = new Route(currentFastest);
//        current.add(src);
//        current.addTime(prev.getTimeToStation(src));
//        if(current.getTotalTime() > currentFastest.getTotalTime() && !current.getStops().contains(dest)) current = new Route();
//
//        if (src != dest) {
//
//            if (src.getTimeToStation(dest) > 0) {
//                current.add(dest);
//                current.addTime(src.getTimeToStation(dest));
//                rlist.add(current);
//
//
//            } else {
//                for (Station st : src.getDestinations().keySet()) {
//                    if (!current.getStops().contains(st)) {
//                        current = getFastestRoute(st,dest,src,current);
//                        Route fastest = getFastestRoute(st, dest, src, current);
//                        if (current == Route.EMPTY || current.getTotalTime() == 0 ||
//                                (current.getTotalTime() > fastest.getTotalTime() && current.getTotalTime() != 0)) current = fastest;
//                    }
//                }
//            }
//
//        }
//        return current;
//    }


}




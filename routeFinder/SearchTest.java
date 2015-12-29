package routeFinder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchTest {
    Search search;
    StationManager sm;

    @Test
    public void testGetFastestRouteAToB() {

        Route fastestRoute = search.getFastestRoute(StationManager.A, StationManager.B, Route.EMPTY);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(3, fastestRoute.getTotalTime());
    }


    @Test
    public void testGetFastestRouteAToC() {

        Route fastestRoute = search.getFastestRoute(StationManager.A, StationManager.C, Route.EMPTY);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(10, fastestRoute.getTotalTime());
    }

    @Test
    public void testGetFastestRouteAToD() {

        Route fastestRoute = search.getFastestRoute(StationManager.A, StationManager.D, Route.EMPTY);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(6, fastestRoute.getTotalTime());
    }

    @Test
    public void testGetFastestRouteAToE() {

        Route fastestRoute = search.getFastestRoute(StationManager.A, StationManager.E, Route.EMPTY);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(13, fastestRoute.getTotalTime());
    }

    @Before
    public void setUp() throws Exception {
        search = new Search();
        sm = new StationManager();
    }

    @After
    public void tearDown() throws Exception {
        search = null;
        sm = null;
    }

}
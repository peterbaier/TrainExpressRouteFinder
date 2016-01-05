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

        Route fastestRoute = search.search(StationManager.A, StationManager.B);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(3, fastestRoute.getTotalTime());
    }


    @Test
    public void testGetFastestRouteAToC() {

        Route fastestRoute = search.search(StationManager.A, StationManager.C);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(10, fastestRoute.getTotalTime());
    }

    @Test
    public void testGetFastestRouteAToD() {

        Route fastestRoute = search.search(StationManager.A, StationManager.D);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(6, fastestRoute.getTotalTime());
    }

    @Test
    public void testGetFastestRouteAToE() {

        Route fastestRoute = search.search(StationManager.A, StationManager.E);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(13, fastestRoute.getTotalTime());
    }

    @Test
    public void testGetFastestRouteBToA() {

        Route fastestRoute = search.search(StationManager.B, StationManager.A);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(3, fastestRoute.getTotalTime());
    }


    @Test
    public void testGetFastestRouteCToA() {

        Route fastestRoute = search.search(StationManager.C, StationManager.A);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(16, fastestRoute.getTotalTime());
    }

    @Test
    public void testGetFastestRouteDToA() {

        Route fastestRoute = search.search(StationManager.C, StationManager.A);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(8, fastestRoute.getTotalTime());
    }


    @Test
    public void testGetFastestRouteEToA() {

        Route fastestRoute = search.search(StationManager.E, StationManager.A);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(17, fastestRoute.getTotalTime());
    }

    @Test
    public void testGetFastestRouteEToB() {

        Route fastestRoute = search.search(StationManager.E, StationManager.B);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(14, fastestRoute.getTotalTime());
    }

    @Test
    public void testGetFastestRouteEToC() {

        Route fastestRoute = search.search(StationManager.E, StationManager.C);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(18, fastestRoute.getTotalTime());
    }

    @Test
    public void testGetFastestRouteEToD() {

        Route fastestRoute = search.search(StationManager.E, StationManager.D);
        System.out.println(fastestRoute.toString());
        Assert.assertEquals(9, fastestRoute.getTotalTime());
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
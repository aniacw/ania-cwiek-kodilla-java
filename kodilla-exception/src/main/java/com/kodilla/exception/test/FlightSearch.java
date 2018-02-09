package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight){
        Map<String, Boolean> searcher = new HashMap<String, Boolean>();
        searcher.put("Chopin", true);
        searcher.put("Heathrow", true);
        searcher.put("Luton", false);
        searcher.put("De Gaulle", false);
        searcher.put("Zurich", true);
        searcher.put("Frankfurt au Mein", false);


    }
}

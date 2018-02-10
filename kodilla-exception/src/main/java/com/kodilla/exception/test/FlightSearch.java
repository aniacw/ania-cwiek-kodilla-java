package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<String, Boolean>();
        flightMap.put("Chopin", true);
        flightMap.put("Heathrow", true);
        flightMap.put("Luton", false);
        flightMap.put("De Gaulle", false);
        flightMap.put("Zurich", true);
        flightMap.put("Frankfurt au Mein", false);
        Boolean result = flightMap.get(flight.getArrivalAirport());
        if(result!=null) {
            return result;
        } else {
            throw new RouteNotFoundException();
        }
    }
}

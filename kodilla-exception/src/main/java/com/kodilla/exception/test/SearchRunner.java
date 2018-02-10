package com.kodilla.exception.test;

public class SearchRunner {
    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();
        Flight flight1 = new Flight("Chopin");
        Flight flight2 = new Flight("Amsterdam");
        Flight flight3 = new Flight("Frankfurt au Mein");

        try {
            Boolean search = flightSearch.findFlight(flight2);
            System.out.println("Searching a flight...");
        } catch (RouteNotFoundException e) {
            System.out.println("No flights available");
        } finally {
            System.out.println("Searching completed");
        }
    }
}

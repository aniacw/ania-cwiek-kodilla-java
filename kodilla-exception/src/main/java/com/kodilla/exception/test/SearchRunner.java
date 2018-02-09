package com.kodilla.exception.test;

public class SearchRunner {
    public static void main(String[] args){
        FlightSearch flightSearch = new FlightSearch();
        Flight flight1 = new Flight("Chopin");
        Flight flight2 = new Flight("Amsterdam");
        Flight flight3 = new Flight("Frankfurt au Mein");


        flightSearch.findFlight(flight2);
    }
}

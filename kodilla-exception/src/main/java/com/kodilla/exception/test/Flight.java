package com.kodilla.exception.test;

public class Flight {

    public String departureAirport;
    public String arrivalAirport;

    public Flight(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}

package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        Flight flight1 = new Flight("warsaw", "moscow");
        Flight flight2 = new Flight("milan", "london");
        Flight flight3 = new Flight("new york", "paris");
        Flight flight4 = new Flight("warsaw", "london");
        Flight flight5 = new Flight("milan", "new york");
        Flight flight6 = new Flight("new york", "moscow");
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
        flights.add(flight6);


        return flights;
    }
}
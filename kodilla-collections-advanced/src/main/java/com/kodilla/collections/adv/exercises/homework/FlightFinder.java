
package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightList = new ArrayList<>();
        for (Flight flights : FlightRepository.getFlightsTable()) {
            if (flights.getDeparture().equals(departure))
                flightList.add(flights);
        }
        return flightList;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightList = new ArrayList<>();
        for (Flight flights : FlightRepository.getFlightsTable()) {
            if (flights.getDeparture().equals(arrival))
                flightList.add(flights);
        }
        return flightList;
    }


}
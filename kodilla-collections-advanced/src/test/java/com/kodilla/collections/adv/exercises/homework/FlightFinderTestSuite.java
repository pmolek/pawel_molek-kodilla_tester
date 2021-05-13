package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFromCorrectAirport() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("warsaw");
        assertEquals(2, result.size());

    }
    @Test
    public void testFindFlightsFromIncorrectAirport() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("berlin");
        assertEquals(0, result.size());

    }

    @Test
    public void testFindingFlightsToCorrectAirport() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("new york");
        assertEquals(2, result.size());

    }
    @Test
    public void testFindingFlightsToIncorrectAirport() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("rio");
        assertEquals(0, result.size());

    }
}

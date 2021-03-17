package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    Map<String, List<Flight>> flightRepository = new HashMap<>();

    public void addFlightIn(String arrival, Airport airport){
       List<Flight> flightsIn = flightRepository.getOrDefault(new ArrayList<>(), airport);


    public static void getFlightsTable(){

    }
}

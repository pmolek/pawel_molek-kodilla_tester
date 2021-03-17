package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    private Airport airport;
    private String departure;
    private String arrival;


    public flightIn(String arrival, Airport airport) {
        this.arrival = arrival;
        this.airport = airport;

    }

    public flightOut(Airport airport, String departure) {
        this.airport = airport;
        this.departure = departure;
    }

    public String getAirport() {
        return airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return airport == flight.airport && Objects.equals(departure, flight.departure) && Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airport, departure, arrival);
    }
}

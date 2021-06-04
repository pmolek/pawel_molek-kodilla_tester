package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTest {
    AirportRepository airportRepository = new AirportRepository();

    @Test
    void airportInUse() throws AirportNotFoundException {
        assertTrue(airportRepository.isAirportInUse("Warsaw"));
    }

    @Test
    void airportNotInUse() throws AirportNotFoundException {
        assertFalse(airportRepository.isAirportInUse("LasPalmas"));
    }
}
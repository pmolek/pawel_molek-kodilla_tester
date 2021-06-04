package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {
    Principal principal = new Principal("name", "lastName");

    @Test
    void getFirstName() {
        assertEquals("name", principal.getFirstName());

    }

    @Test
    void getLastName() {
        assertEquals("lastName", principal.getLastName());
    }
}
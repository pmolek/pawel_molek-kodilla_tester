package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student("name", "lastName");

    @Test
    void getFirstName() {
        assertEquals("name", student.getFirstName());

    }

    @Test
    void getLastName() {
        assertEquals("lastName", student.getLastName());
    }
}
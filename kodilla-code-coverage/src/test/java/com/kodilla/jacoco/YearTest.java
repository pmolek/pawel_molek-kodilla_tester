package com.kodilla.jacoco;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 1600, 1904, 2000})
    void shouldReturnLeapYear(int numbers) {
        Year year = new Year(numbers);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @ParameterizedTest
    @ValueSource(ints = {1650, 1900})
    void shouldNotReturnLeapYear(int numbers) {
        Year year = new Year(numbers);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }

}
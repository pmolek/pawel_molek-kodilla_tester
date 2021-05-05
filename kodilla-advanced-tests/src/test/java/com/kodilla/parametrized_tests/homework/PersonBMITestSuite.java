package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonBMITestSuite {


    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideValuesForBMI")
    public void getBMI(double heightInMeters, double weightInKilogram, String expected) {
        Person person = new Person(heightInMeters, weightInKilogram);
        assertEquals(expected, person.getBMI());
    }


}

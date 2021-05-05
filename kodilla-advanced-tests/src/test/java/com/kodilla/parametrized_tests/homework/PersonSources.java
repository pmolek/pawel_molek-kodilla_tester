package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideValuesForBMI() {
        return Stream.of(
                Arguments.of(1.85, 70, "Normal (healthy weight)"),
                Arguments.of(1.70, 80, "Overweight"),
                Arguments.of(1.60, 90, "Obese Class II (Severely obese)"),
                Arguments.of(1.50, 40, "Underweight"),
                Arguments.of(2.00, 100, "Overweight")
        );
    }
}

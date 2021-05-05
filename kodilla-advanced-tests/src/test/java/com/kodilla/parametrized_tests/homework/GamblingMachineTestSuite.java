package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GamblingMachineTestSuite {
    private GamblingMachine gamble = new GamblingMachine();


    private Set<Integer> convertToSet(String input) {
        String[] strings = input.split(",");
        Set<Integer> numbers = new HashSet<>();
        for (String element : strings) {
            numbers.add(Integer.parseInt(element));
        }
        return numbers;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbersCorrect.csv", numLinesToSkip = 1)
    public void shouldShowHowManyWinsWithCorrectNumbers(String input) throws InvalidNumbersException {
        Set<Integer> numbers = convertToSet(input);
        System.out.println(numbers);
        int result = gamble.howManyWins(numbers);

        assertTrue(result >= 0 && result <=6);


    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbersIncorrect.csv", numLinesToSkip = 1)
    public void shouldShowInvalidResults(String input) throws InvalidNumbersException {
        Set<Integer> numbers = convertToSet(input);
        System.out.println(numbers);
        assertThrows(InvalidNumbersException.class, () -> gamble.howManyWins(numbers));
    }

}
package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"bab", "lenny.popowitz", "JohnSnow", "123"})
    public void shouldValidateUserNameValid(String userName) {
        assertTrue(validator.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ab", "b&c", "$=@", "#_oko", "", "   "})
    public void shouldValidateUserNameInvalid(String userName) {
        assertFalse(validator.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1@2.pl", "john@web.com", "test@example.example.iana.org"})
    public void shouldValidateEmailValid(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"%^&@org", "lenny,popowitz@kodilla.com", "diana(at)wiki.org.pl", "jenny/slash@live.it", "jenny @ live.it", "storm@org,uk", "\"test.test\"@iana.org", "@bar.com", "@@bar.com"})
    public void shouldValidateEmailInvalid(String email) {
        assertFalse(validator.validateEmail(email));
    }
}

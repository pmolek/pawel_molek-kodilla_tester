package com.kodilla.abstracts.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultCheckerTest {

    @Test
    public void check(){
        assertTrue(ResultChecker.assertEquals(1,1));
    }
}
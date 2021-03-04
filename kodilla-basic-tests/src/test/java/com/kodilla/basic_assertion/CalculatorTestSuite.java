package com.kodilla.basic_assertion;

import com.kodilla.abstracts.basic_assertion.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        Assertions.assertEquals(13, sumResult);
    }


    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        Assertions.assertEquals(-3, subtractResult);

    }

    @Test
    public void testSqrd() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;

        int sqrdResult = calculator.sqrd(a, b);
        Assertions.assertEquals(25, sqrdResult);


    }
    @Test
    public void testSqrd2() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = -2;

        int sqrdResult = calculator.sqrd(a, b);
        Assertions.assertEquals(0, sqrdResult);


    }
    @Test
    public void testSqrd3() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 0;

        int sqrdResult = calculator.sqrd(a, b);
        Assertions.assertEquals(1, sqrdResult);


    }
    @Test
    public void testSqrd4() {
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 2;

        int sqrdResult = calculator.sqrd(a, b);
        Assertions.assertEquals(0, sqrdResult);


    }
    @Test
    public void testSqrd5() {
        Calculator calculator = new Calculator();
        int a = -2;
        int b = 2;

        int sqrdResult = calculator.sqrd(a, b);
        Assertions.assertEquals(4, sqrdResult);


    }

}



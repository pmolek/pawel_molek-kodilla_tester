package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("metoda działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("metoda nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct2) {
            System.out.println("metoda działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("metoda nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int sqrdResult = calculator.sqrd(a, b);
        boolean correct3 = ResultChecker.assertEquals(390625, sqrdResult);
        if (correct3) {
            System.out.println("metoda działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("metoda nie działa poprawnie dla liczb " + a + " i " + b);


        }
    }
}

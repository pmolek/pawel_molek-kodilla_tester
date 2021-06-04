package com.kodilla.abstracts.basic_assertion;

public class PrimeChecker {
    private int count;

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}

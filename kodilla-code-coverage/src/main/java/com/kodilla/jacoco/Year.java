package com.kodilla.jacoco;

public class Year {
    int years;

    public Year(int years) {
        this.years = years;
    }

    public boolean isLeap() {
        if (this.years % 4 == 0) {
            if (this.years % 100 == 0) {
                return this.years % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
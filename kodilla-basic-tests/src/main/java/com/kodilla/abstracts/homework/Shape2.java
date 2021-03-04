package com.kodilla.abstracts.homework;

public class Shape2 extends Shape {
    private int r;

    public Shape2(int r) {
        this.r = r;
        System.out.println("obliczanie pola i obwodu koła");
    }

    @Override
    public double giveSurfaceArea() {
        double SA1;
        SA1 = Pi * r * r;
        return SA1;
    }

    @Override
    public double giveCircumference() {
        double CF1;
        CF1 = 2 * Pi * r;
        return CF1;
    }

}

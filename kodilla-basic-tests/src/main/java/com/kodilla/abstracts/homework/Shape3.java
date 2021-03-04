package com.kodilla.abstracts.homework;

public class Shape3 extends Shape {
    private int p;
    private int h;


    public Shape3(int p, int h) {
        this.p = p;
        this.h = h;
        System.out.println("obliczanie pola i obwodu trójkąta równobocznego");
    }

    @Override
    public double giveSurfaceArea() {
        double SA1;
        SA1 = (p * h)/2;
        return SA1;
    }

    @Override
    public double giveCircumference() {
        double CF1;
        CF1 = 3 * p;
        return CF1;
    }

}

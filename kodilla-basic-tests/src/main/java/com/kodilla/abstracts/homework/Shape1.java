package com.kodilla.abstracts.homework;

public class Shape1 extends Shape {
    private int a;
    private int b;

    public Shape1(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("obliczanie pola i obwodu prostokąta");
    }

    @Override
    public double giveSurfaceArea() {
        double SA1;
        SA1 = a * b;
        return SA1;
    }

    @Override
    public double giveCircumference() {
        double CF1;
        CF1 = 2 * (a + b);
        return CF1;
    }

}

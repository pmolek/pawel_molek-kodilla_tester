package com.kodilla.collections.interfaces;

public class Triangle implements Shape {
    double width;
    double heigth;
    double hypotenuse;

    public Triangle(double width, double heigth, double hypotenuse) {
        this.width = width;
        this.heigth = heigth;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return width * heigth / 2;
    }

    @Override
    public double getPerimeter() {
        return width + heigth + hypotenuse;
    }
}

package com.kodilla.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", heigth=" + heigth +
                ", hypotenuse=" + hypotenuse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.width, width) == 0 && Double.compare(triangle.heigth, heigth) == 0 && Double.compare(triangle.hypotenuse, hypotenuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, heigth, hypotenuse);
    }
}

package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape1 shape1 = new Shape1(2, 5);
        shape1.giveSurfaceArea();
        shape1.giveCircumference();
        System.out.println("pole to " + shape1.giveSurfaceArea());
        System.out.println("obwód to "+ shape1.giveCircumference());

        Shape2 shape2 = new Shape2(10);
        shape2.giveSurfaceArea();
        shape2.giveCircumference();
        System.out.println("pole to " + shape2.giveSurfaceArea());
        System.out.println("obwód to "+ shape2.giveCircumference());

        Shape3 shape3 = new Shape3(10,8);
        shape3.giveSurfaceArea();
        shape3.giveCircumference();
        System.out.println("pole to " + shape3.giveSurfaceArea());
        System.out.println("obwód to "+ shape3.giveCircumference());
    }
}

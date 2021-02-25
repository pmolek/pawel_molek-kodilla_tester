package com.kodilla.inheritance.homework;

public class OperatingSystem2 extends OperatingSystem {
    public OperatingSystem2(int year) {
        super(year);
        System.out.println("New version");
    }

    @Override
    public void turnOn() {
        System.out.println("System crashed");
    }
}

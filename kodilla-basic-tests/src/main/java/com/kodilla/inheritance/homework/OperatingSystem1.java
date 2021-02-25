package com.kodilla.inheritance.homework;

public class OperatingSystem1 extends OperatingSystem {
    public OperatingSystem1(int year) {
        super(year);
        System.out.println("Old version");
    }

    @Override
    public void turnOff() {
        System.out.println("System crashed");
    }
}

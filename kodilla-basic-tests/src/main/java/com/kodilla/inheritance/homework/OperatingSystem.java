package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public void turnOn() {
        System.out.println("System is turned on");
    }
    public void turnOff() {
        System.out.println("System is turned off");
    }
    public OperatingSystem(int year) {
        this.year = year;
    }

    public void displayYear() {

        System.out.println("Annonced in: " + year);
        System.out.println();
    }
}

package com.kodilla.inheritance.homework;

public class OperatingSystemTest {
    public static void main(String[] args) {
        OperatingSystem System = new OperatingSystem(2015);

        System.turnOn();
        System.turnOff();
        System.displayYear();

        OperatingSystem1 System1 = new OperatingSystem1(2010);
        System1.turnOn();
        System1.turnOff();
        System1.displayYear();

        OperatingSystem2 System2 = new OperatingSystem2(2020);
        System2.turnOn();
        System2.turnOff();
        System2.displayYear();

    }
}

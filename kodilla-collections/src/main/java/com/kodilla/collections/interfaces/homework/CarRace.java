package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        System.out.println();
        Car1 car1 = new Car1(30);
        System.out.print("Dla Car1 ");
        doRace(car1);

        Car2 car2 = new Car2(25);
        System.out.print("Dla Car2 ");
        doRace(car2);

        Car3 car3 = new Car3(40);
        System.out.print("Dla Car3 ");
        doRace(car3);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("końcowa prędkość samochodu to " + car.getSpeed());
        System.out.println();
    }
}


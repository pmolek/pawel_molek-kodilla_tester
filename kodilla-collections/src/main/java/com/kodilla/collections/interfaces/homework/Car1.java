package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Car1 implements Car {
    private int speed;



    public Car1(int speed) {
        this.speed = speed;

    }

    @Override
    public void increaseSpeed() {
        speed = 30 + speed;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 20;

    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car1 car1 = (Car1) o;
        return speed == car1.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}

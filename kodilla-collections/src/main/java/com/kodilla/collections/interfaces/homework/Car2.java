package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Car2 implements Car {
    private int speed;



    public Car2(int speed) {
        this.speed = speed;

    }

    @Override
    public void increaseSpeed() {
        speed = 50 + speed;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 10;

    }

    @Override
    public int getSpeed() {
        return speed;
    }


    @Override
    public String toString() {
        return "Car2{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car2 car2 = (Car2) o;
        return speed == car2.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}

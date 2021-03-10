package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Car3 implements Car {
    private int speed;



    public Car3(int speed) {
        this.speed = speed;

    }

    @Override
    public void increaseSpeed() {
        speed = 70 + speed;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 50;

    }

    @Override
    public int getSpeed() {
        return speed;
    }


    @Override
    public String toString() {
        return "Car3{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car3 car3 = (Car3) o;
        return speed == car3.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}

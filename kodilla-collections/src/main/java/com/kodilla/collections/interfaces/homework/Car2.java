package com.kodilla.collections.interfaces.homework;

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

}

package com.kodilla.collections.interfaces.homework;

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

}

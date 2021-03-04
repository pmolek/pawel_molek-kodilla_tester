package com.kodilla.collections.interfaces.homework;

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

}

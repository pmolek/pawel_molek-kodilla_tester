package com.kodilla.collections.interfaces.homework;

public class Car1 implements Car {
    private int speedPlus;
    private int speedMinus;


    public Car1(int speedPlus, int speedMinus) {
        this.speedPlus = speedPlus;
        this.speedMinus = speedMinus;
    }

    @Override
    public int increaseSpeed() {
        return 3 * speedPlus;
    }

    @Override
    public int decreaseSpeed() {
        return 2 * speedMinus;

    }

    @Override
    public int getSpeed() {
        return startSpeed + increaseSpeed() - decreaseSpeed();
    }

}

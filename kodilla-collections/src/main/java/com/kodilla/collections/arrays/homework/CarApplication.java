package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Car1;
import com.kodilla.collections.interfaces.homework.Car2;
import com.kodilla.collections.interfaces.homework.Car3;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();

        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarKind = random.nextInt(3);
        int sp = random.nextInt(100);
        int sm = random.nextInt(100);
        if (drawCarKind == 0)
            return new Car1(sp, sm);
        else if (drawCarKind == 1)
            return new Car2(sp, sm);
        else
            return new Car3(sp, sm);

    }
}
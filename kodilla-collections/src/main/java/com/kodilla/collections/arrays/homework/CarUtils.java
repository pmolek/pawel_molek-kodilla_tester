package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Car1;
import com.kodilla.collections.interfaces.homework.Car2;
import com.kodilla.collections.interfaces.homework.Car3;


public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Speed increase: " + car.increaseSpeed());
        System.out.println("Speed decrease: " + car.decreaseSpeed());
    }
    private static String getCarName(Car car) {
        if (car instanceof Car1)
            return "Car1";
        else if (car instanceof Car2)
            return "Car2";
        else if (car instanceof Car3)
            return "Car3";
        else
            return "Unknown car name";
    }

}

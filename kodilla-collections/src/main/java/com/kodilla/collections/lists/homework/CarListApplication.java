package com.kodilla.collections.lists.homework;


import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Car1;
import com.kodilla.collections.interfaces.homework.Car2;
import com.kodilla.collections.interfaces.homework.Car3;



import java.util.ArrayList;
import java.util.List;

public class CarListApplication {



    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car1(50));
        cars.add(new Car2(30));
        cars.add(new Car3(10));

       for (Car car: cars) {
           CarUtils.describeCar(car);
       }

        System.out.println("-----------------------------");
        for (Car car: cars) System.out.println("car speed: " + car.getSpeed());
        System.out.println(cars.size());

        System.out.println("-----------------------------");
        cars.remove(1);
        for (Car car: cars) System.out.println("car speed: " + car.getSpeed());
        System.out.println(cars.size());

        System.out.println("-----------------------------");
        cars.remove(new Car1(50));
        for (Car car: cars) System.out.println("car speed: " + car.getSpeed());
        System.out.println(cars.size());
    }

}

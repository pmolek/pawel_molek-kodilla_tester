package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class CarFactoryTestSuite {

    @Test
    public void shouldShowCarAdequateToSeasonAndCheckLights() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");
        //When
        String carName = car.getCarType();
        //Then
        List<String> possibleCar = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleCar.contains(carName));
        System.out.println();
        System.out.println();
        System.out.println("Car type: " + carName);
        System.out.println("Lights on? - " + car.hasLightsTurnedOn());
    }
}


package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car{
    LocalTime localTime = LocalTime.now();
    @Override
    public boolean hasLightsTurnedOn() {
        return localTime.isAfter(LocalTime.of(20, 00)) || localTime.isBefore(LocalTime.of(06, 00));

    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}

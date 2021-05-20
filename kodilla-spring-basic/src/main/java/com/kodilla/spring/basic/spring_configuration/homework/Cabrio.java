package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car{
    LocalTime localTime = LocalTime.now();
    @Override
    public boolean hasLightsTurnedOn() {
        return localTime.isAfter(LocalTime.of(20, 0)) || localTime.isBefore(LocalTime.of(6, 0));

    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}

package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;


@Configuration
public class CarFactory {
    LocalDate localDate = LocalDate.now();

    @Bean
    public Car chooseCar() {
        Car car;
        if (localDate.isAfter(LocalDate.of(2021, 6, 21)) && localDate.isBefore(LocalDate.of(2021, 9, 23))) {
            car = new Cabrio();

        } else if (localDate.isAfter(LocalDate.of(2021, 12, 22)) || localDate.isBefore(LocalDate.of(2021, 3, 21))) {
            car = new SUV();

        } else {
            car = new Sedan();

        }
        return car;
    }

}

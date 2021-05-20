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
        if (localDate.getDayOfYear() > 150 && localDate.getDayOfYear() < 270) {
            car = new Cabrio();

        } else if (localDate.getDayOfYear() < 50 || localDate.getDayOfYear() > 330) {
            car = new SUV();

        } else {
            car = new Sedan();

        }
        return car;
    }

}

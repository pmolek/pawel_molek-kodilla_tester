package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    String login;
    LocalDate date;
    double value;


    public Order(String login, LocalDate date, double value) {
        this.login = login;
        this.date = date;
        this.value = value;
    }


    public LocalDate getDate() {
        return date;
    }

    public double getValue() {
        return value;
    }
}

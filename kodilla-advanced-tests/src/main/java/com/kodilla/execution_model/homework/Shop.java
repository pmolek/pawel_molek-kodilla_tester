package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();


    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public int getSize() {
        return this.orders.size();
    }

    public void clear() {
        this.orders.clear();
    }

    public Order getOrder(int index) {
        if (index >= 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return null;
    }

    public int getOrdersByDate(LocalDate dateMin, LocalDate dateMax) {
        System.out.println("Orders between dates: " + dateMin + " & " + dateMax);
        int count = 0;
        for (Order order : orders) {

            if (order.getDate().isAfter(dateMin) & order.getDate().isBefore(dateMax)) {

                System.out.println("login: " + order.login + ", date: " + order.date);
                count++;
            }
        } if (count == 0) {
            System.out.println("No orders");
        }
        return count;
    }

    public int getOrdersByValue(double minValue, double maxValue){

        System.out.println("Orders between values: " + minValue + " & " + maxValue);
        int count = 0;
        for (Order order : orders) {

            if (order.getValue() >= minValue & maxValue >= order.getValue()) {

                System.out.println("login: " + order.login + ", value: " + order.value);
                count++;
            }


        }
        if (count == 0) {
            System.out.println("No orders");
        }
        return count;
    }

    public Double getSum() {
        double sum = 0;
        for (Order order : orders) {
            sum = sum + order.getValue();
        }
        return sum;
    }
}

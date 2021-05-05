package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order("login1", LocalDate.of(2021,4,12), 500.00);
    Order order2 = new Order("login2", LocalDate.of(2021,4,14), 1500.00);
    Order order3 = new Order("login3", LocalDate.of(2021,4,16), 2000.00);
    Order order4 = new Order("login4", LocalDate.of(2021,4,18), 5500.00);
    Order order5 = new Order("login5", LocalDate.of(2021,4,20), 15000.00);

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
    }

    @Test
    public void shouldAddNewOrder() {
        assertEquals(5, shop.getSize());
    }

    @Test
    public void shouldShowOrdersBetweenDates(){
        assertEquals(2,shop.getOrdersByDate(LocalDate.of(2021,4,10), LocalDate.of(2021,4,15)));
        assertEquals(0,shop.getOrdersByDate(LocalDate.of(2021,5,10), LocalDate.of(2021,4,15)));
        assertEquals(0,shop.getOrdersByDate(LocalDate.of(2021,5,10), LocalDate.of(2021,6,15)));
    }

    @Test
    public void shouldShowOrdersBetweenValues(){
        assertEquals(0, shop.getOrdersByValue(-2000.00, -1000.00));
        assertEquals(3, shop.getOrdersByValue(0.00, 2000.00));
    }


    @Test
    public void shouldShowSumOfOrders(){
        shop.clear();
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        assertEquals(3, shop.getSize());
    }

    @Test
    public void shouldShowSumOfValues(){
        assertEquals(24500, shop.getSum());
    }

}

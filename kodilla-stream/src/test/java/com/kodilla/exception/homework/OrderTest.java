package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void getNumber() {
        Order order = new Order("123");
        assertEquals("123", order.getNumber());
    }

}
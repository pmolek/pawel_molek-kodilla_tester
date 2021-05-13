package com.kodilla.exception.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void shouldThrowException() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        Assertions.assertThrows(OrderDoesntExistException.class, ()->warehouse.getOrder("130"));
    }

    @Test
    public void shouldNotThrowException() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder((new Order("123")));
        Assertions.assertNotNull(warehouse.getOrder("123"));
    }
}
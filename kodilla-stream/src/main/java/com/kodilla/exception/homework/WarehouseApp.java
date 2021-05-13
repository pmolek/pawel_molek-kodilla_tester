package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("124"));
        warehouse.addOrder(new Order("125"));
        warehouse.addOrder(new Order("126"));
        warehouse.addOrder(new Order("127"));

        warehouse.getOrder("125");

    }
}
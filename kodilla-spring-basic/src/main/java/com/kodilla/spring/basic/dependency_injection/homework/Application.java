package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        deliveryServiceIMPL delivery = new deliveryServiceIMPL();
        notofocationServiveIMPL notification = new notofocationServiveIMPL();
        ShippingCenter shippingCenter = new ShippingCenter(delivery, notification);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);


    }
}
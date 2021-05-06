package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        deliveryServiceIMPL delivery = new deliveryServiceIMPL();
        notificationServiceIMPL notification = new notificationServiceIMPL();
        ShippingCenter shippingCenter = new ShippingCenter(delivery, notification);
        shippingCenter.sendPackage("Hill Street 11, New York", 45);


    }
}
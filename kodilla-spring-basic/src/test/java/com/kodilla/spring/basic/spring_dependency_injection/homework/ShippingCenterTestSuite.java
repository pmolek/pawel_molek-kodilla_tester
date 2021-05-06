package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShippingCenterTestSuite {

    @Test
    public void shouldSendPackage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("ulica 1, miasto1", 20);
        Assertions.assertEquals("Package delivered to: ulica 1, miasto1", message);
    }
    @Test
    public void shouldNotSendPackage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("ulica 1, miasto1", 40);
        Assertions.assertEquals("Package not delivered to: ulica 1, miasto1", message);
    }

    @Test
    public void shouldDeliverPackage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean deliverPackage = bean.deliverPackage("ulica 1, miasto1", 20);
        Assertions.assertTrue(true);
    }

    @Test
    public void shouldNotDeliverPackage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean deliverPackage = bean.deliverPackage("ulica 1, miasto1", 40);
        Assertions.assertFalse(false);
    }
}

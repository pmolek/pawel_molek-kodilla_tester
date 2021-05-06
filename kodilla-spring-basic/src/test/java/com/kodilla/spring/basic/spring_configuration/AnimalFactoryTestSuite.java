package com.kodilla.spring.basic.spring_configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class AnimalFactoryTestSuite {

    @Test
    public void testDogCreated(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Dog dog = context.getBean(Dog.class);

        String voice = dog.getVoice();

        Assertions.assertEquals("bark bark", voice);
    }








}

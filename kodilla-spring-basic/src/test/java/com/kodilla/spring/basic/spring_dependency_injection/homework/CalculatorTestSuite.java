package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {


    @Test
    public void shouldReturnValue(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Display bean = context.getBean(Display.class);
        double value = bean.display(5.0);
        Assertions.assertEquals(5.0, value);
    }

    @Test
    public void shouldShowSum() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.add(4.5, 1.5);
        Assertions.assertEquals(6.0, value);
    }

    @Test
    public void shouldShowSub() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.subtract(4.5, 1.5);
        Assertions.assertEquals(3.0, value);
    }

    @Test
    public void shouldShowMul() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.multiply(4.5, 1.5);
        Assertions.assertEquals(6.75, value);
    }

    @Test
    public void shouldShowDiv() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.divide(4.5, 1.5);
        Assertions.assertEquals(3.0, value);
    }
}

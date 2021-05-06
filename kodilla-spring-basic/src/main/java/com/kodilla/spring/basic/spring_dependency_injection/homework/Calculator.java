package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display){
        this.display = display;

    }

    public double add(double a, double b){
        double sum = a + b;
        return display.display(sum);
    }

    public double subtract(double a, double b){
        double sub = a - b;
        return display.display(sub);
    }

    public double multiply(double a, double b){
        double mul = a * b;
        return display.display(mul);
    }

    public double divide(double a, double b){
        if (b != 0) {
            double div = a / b;
            return display.display(div);
        }
        System.out.println("Change b value");
        return b;
    }



}

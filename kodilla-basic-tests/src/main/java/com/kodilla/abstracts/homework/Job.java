package com.kodilla.abstracts.homework;

public abstract class Job {
    String responsibilities;
    int salary;


    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public abstract String getResponsibilities();
}
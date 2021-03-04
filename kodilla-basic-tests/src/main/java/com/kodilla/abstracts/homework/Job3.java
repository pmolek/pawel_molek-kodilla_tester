package com.kodilla.abstracts.homework;

public class Job3 extends Job {


    public Job3(int salary, String responsibilities) {
        super(salary, responsibilities);

    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }

}

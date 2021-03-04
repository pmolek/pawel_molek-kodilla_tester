package com.kodilla.abstracts.homework;


public class PersonTest {


    public static void main(String[] args) {
        Person person1 = new Person("pawel", 32, "konserwator powierzchni plaskich");
        Person person2 = new Person("jan", 25, "radiotelegrafista");
        Person person3 = new Person("zenek", 50, "diler");
        Job1 job1 = new Job1(1000, "sprzatanie");
        Job2 job2 = new Job2(2000, "umawianie spotkan");
        Job3 job3 = new Job3(3000, "obsluga klienta");

        job1.getResponsibilities();
        System.out.println("Obowiazki pracownika " + person1.firstName + " na stanowisku " + person1.job + " to " + job1.getResponsibilities());

        job2.getResponsibilities();
        System.out.println("Obowiazki pracownika " + person2.firstName + " na stanowisku " + person2.job + " to " + job2.getResponsibilities());

        job3.getResponsibilities();
        System.out.println("Obowiazki pracownika " + person3.firstName + " na stanowisku " + person3.job + " to " + job3.getResponsibilities());
    }

}

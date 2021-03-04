package com.kodilla.abstracts.homework;


public class PersonTest {


    public static void main(String[] args) {
        Person person1 = new Person("pawel", 32, new Job1(1000, "sprzatanie"));
        Person person2 = new Person("jan", 25, new Job2(2000, "umawianie spotkan"));
        Person person3 = new Person("zenek", 50, new Job3(3000, "obsluga klienta"));



        System.out.println("Obowiazki pracownika " + person1.firstName + " na stanowisku to " + person1.getResponsibilities());


        System.out.println("Obowiazki pracownika " + person2.firstName + " na stanowisku to " + person2.getResponsibilities());


        System.out.println("Obowiazki pracownika " + person3.firstName + " na stanowisku to " + person3.getResponsibilities());
    }

}

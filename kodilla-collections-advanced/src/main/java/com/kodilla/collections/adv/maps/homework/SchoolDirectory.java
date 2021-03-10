package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();
        Principal principal1 = new Principal("Adam", "Pierwszy");
        Principal principal2 = new Principal("Beniamin", "Drugi");
        Principal principal3 = new Principal("Cezary", "Trzeci");

        School school1 = new School("pierwsza", 100, 200, 300);
        School school2 = new School("druga", 300, 400, 600);
        School school3 = new School("trzecia", 400, 600, 900);

        schools.put(principal1, school1);
        schools.put(principal2, school2);
        schools.put(principal3, school3);
       

        for (Map.Entry<Principal, School> principalEntry : schools.entrySet()) {
            System.out.println(principalEntry.getValue().getName() + " " + principalEntry.getKey().getFirstName() + " " + principalEntry.getKey().getLastName() + " ilosc studentow: " + principalEntry.getValue().sumStudents());
        }
    }
}


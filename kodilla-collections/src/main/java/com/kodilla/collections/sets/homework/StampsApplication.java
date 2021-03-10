package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("stamp1", 120, 100, false));
        stamps.add(new Stamp("stamp2", 100, 80, true));
        stamps.add(new Stamp("stamp3", 80, 40, true));
        stamps.add(new Stamp("stamp4", 60, 20, false));
        stamps.add(new Stamp("stamp5", 40,10,true));
        stamps.add(new Stamp("stamp1", 120,100, false));
        stamps.add(new Stamp("stamp2", 100, 80, true));
        stamps.add(new Stamp("stamp3", 80, 40, true));
        stamps.add(new Stamp("stamp4", 60, 20, false));
        stamps.add(new Stamp("stamp5", 40,10,true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}

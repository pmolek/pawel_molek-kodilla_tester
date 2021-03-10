package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class School {
    private static String name;

    private List<Integer> students = new ArrayList<>();

    public School(String name, int... students){
        this.name = name;
        for (int student : students)
            this.students.add(student);
    }
    public int sumStudents(){
        int sum = 0;
        for (int student : students)
            sum += student;
        return sum;
}

    public static String getName() {
        return School.name;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

}

package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.kodilla.optional.homework.Teacher;

public class Application {


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("student1", null));
        students.add(new Student("student2", new Teacher("teacher1")));
        students.add(new Student("student3", new Teacher("teacher2")));
        students.add(new Student("student4", new Teacher("teacher1")));
        students.add(new Student("student5", new Teacher("teacher2")));
        students.add(new Student("student6", null));

        for (Student Student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(Student.getTeacher());
            optionalTeacher.ifPresentOrElse(
                    (teacher)
                            -> {
                        System.out.println("student: " + Student.getName() + " nauczyciel:  " + Student.getTeacher().getName());
                    },
                    ()
                            -> {
                        System.out.println("student: " + Student.getName() + " nauczyciel: <undefined>");
                    });

        }

    }
}

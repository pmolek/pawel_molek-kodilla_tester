package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Teacher teacher = new Teacher("teacher");
    Student student = new Student("name", teacher);
    @Test
    void getName() {
        assertEquals("name", student.getName());
    }
    @Test
    void getTeacher() {
        assertEquals(teacher, student.getTeacher());
    }

}
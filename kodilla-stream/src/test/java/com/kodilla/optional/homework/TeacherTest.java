package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    Teacher teacher = new Teacher("test");

    @Test
    void getName() {
        assertEquals("test", teacher.getName());
    }
}
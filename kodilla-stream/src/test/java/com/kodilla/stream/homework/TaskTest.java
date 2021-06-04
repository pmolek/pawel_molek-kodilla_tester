package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    Task task = new Task("name", LocalDate.of(2021, 6, 4), LocalDate.of(2021, 6, 30));
    TaskRepository taskRepository = new TaskRepository();

    @Test
    void getName() {
        assertEquals("name", task.getName());
    }

    @Test
    void getOpened() {
        assertEquals(LocalDate.of(2021, 6, 4), task.getOpened());
    }

    @Test
    void getDeadline() {
        assertEquals(LocalDate.of(2021, 6, 30), task.getDeadline());
    }

}
package com.kodilla.collections.adv.immutable.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    Task task = new Task("title", 10);

    @Test
    void getTitle() {
        assertEquals("title", task.getTitle());
    }

    @Test
    void getDuration() {
        assertEquals(10, task.getDuration());
    }
}
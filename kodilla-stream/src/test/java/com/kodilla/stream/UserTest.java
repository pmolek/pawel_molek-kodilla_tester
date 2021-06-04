package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
User user = new User("name", 30, 3, "one");
    @Test
    void getUsername() {
        assertEquals("name", user.getUsername());
    }

    @Test
    void getAge() {
        assertEquals(30, user.getAge());
    }

    @Test
    void getNumberOfPost() {
        assertEquals(3, user.getNumberOfPost());
    }

    @Test
    void getGroup() {
        assertEquals("one", user.getGroup());
    }
}
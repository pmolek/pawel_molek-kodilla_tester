package com.kodilla.collections.adv.immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book("author", "title");
    @Test
    void getAuthor() {
        assertEquals("author", book.getAuthor());
    }

    @Test
    void getTitle() {
        assertEquals("title", book.getTitle());
    }
}
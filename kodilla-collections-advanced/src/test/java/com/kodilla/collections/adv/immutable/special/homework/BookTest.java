package com.kodilla.collections.adv.immutable.special.homework;

import com.kodilla.collections.adv.immutable.Book;
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

    @Test
    void testGetTitle() {
        assertEquals("author", book.getAuthor());
    }

    @Test
    void testGetAuthor() {
        assertEquals("title", book.getTitle());
    }
}
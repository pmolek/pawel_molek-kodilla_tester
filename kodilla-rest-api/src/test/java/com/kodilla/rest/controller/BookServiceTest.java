package com.kodilla.rest.controller;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {
    List<BookDto> books = new ArrayList<>();
    @Test
    void getBooks() {
        books.add(0, new BookDto("title", "author"));
        assertEquals(1, books.size());

    }

    @Test
    void addBook() {
        books.add(0, new BookDto("title", "author"));
        assertEquals(1, books.size());
    }

    @Test
    void removeBook() {
        books.add(0, new BookDto("title", "author"));
        books.add(1, new BookDto("title1", "author1"));
        books.remove(0);
        assertEquals(1, books.size());
    }
}
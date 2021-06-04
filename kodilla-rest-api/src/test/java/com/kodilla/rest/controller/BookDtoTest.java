package com.kodilla.rest.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookDtoTest {

    BookDto bookDto = new BookDto("title", "author");
    @Test
    void getTitle() {
        assertEquals("title", bookDto.getTitle());
    }

    @Test
    void getAuthor() {
        assertEquals("author", bookDto.getAuthor());
    }
}
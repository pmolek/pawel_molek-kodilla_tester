package com.kodilla.rest.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTest {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }


    @Test
    public void shouldAddAndRemoveBooks(){
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(bookController.addBook(bookServiceMock.addBook((new BookDto("title1", "author1")))));
        bookList.add(bookController.addBook(bookServiceMock.addBook((new BookDto("title2", "author2")))));
        bookList.add(bookController.addBook(bookServiceMock.addBook((new BookDto("title3", "author3")))));

        Mockito.when(bookController.getBooks()).thenReturn(bookList);


        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(3);

    }

}
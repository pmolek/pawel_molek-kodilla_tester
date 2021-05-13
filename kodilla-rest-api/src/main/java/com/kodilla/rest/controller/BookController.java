package com.kodilla.rest.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public
class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public BookDto addBook(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
        return bookDto;
    }

    @DeleteMapping
    public void removeBook(@RequestBody BookDto bookDto){
        bookService.removeBook(bookDto);
    }


}
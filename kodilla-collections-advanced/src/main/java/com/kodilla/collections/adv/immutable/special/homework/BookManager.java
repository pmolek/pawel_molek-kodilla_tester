package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    static Set<Book> bookSet = new HashSet<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        bookSet.add(book);
        return book;
    }

}


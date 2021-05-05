package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1;
        Book book2;

        book1 = BookManager.createBook("title1", "author1");
        book2 = BookManager.createBook("title2", "author2");

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));

    }
}
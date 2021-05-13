package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        Book book1 = BookManager.createBook("title1", "author1");
        Book book2 = BookManager.createBook("title1", "author1");
        Book book3 = BookManager.createBook("title2", "author2");

        System.out.println("---------------");

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
        System.out.println("---------------");

        System.out.println(book1 == book3);
        System.out.println(book1.equals(book3));
        System.out.println("---------------");


    }
}
package org.example.services;

import org.example.books.Book;

public class MailService {
    public void finalizePurchase(Book book, String email) {
        System.out.println("Book Purchased successfully");
    }
}

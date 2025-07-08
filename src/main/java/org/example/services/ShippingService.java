package org.example.services;

import org.example.books.Book;

public class ShippingService {
    public void finalizePurchase(Book book , String address , int quantity) {
        System.out.println("Book Purchased successfully");
    }
}

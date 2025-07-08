package org.example.books;

import java.security.Timestamp;

public class Book {
    private final String ISBN;
    private String title;
    private int publishYear;
    private double price;
    private String author;
    protected boolean sellable;
    protected int stockQuantity;


    public Book(String isbn , String TITLE , int PUBLISHYEAR , double PRICE, String AUTHOR) {
        ISBN = isbn;
        setTitle(TITLE);
        setPublishYear(PUBLISHYEAR);
        setPrice(PRICE);
        setAuthor(AUTHOR);
        sellable = false;
        setStockQuantity(0);
    }

    //getters
    public String getISBN() {
        return ISBN;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public boolean isSellable() {
        return sellable;
    }

    public String getAuthor() {
        return author;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }


    public void setAuthor(String author) {
        this.author = author;
    }
}

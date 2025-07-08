package org.example.books;

import org.example.services.MailService;

public class Ebook extends Book{
    private String fileType;
    public Ebook(String isbn, String TITLE, int PUBLISHYEAR, double PRICE, String AUTHOR , String FYLETYPE) {
        super(isbn, TITLE, PUBLISHYEAR, PRICE, AUTHOR);
        sellable = true;
        fileType = FYLETYPE;
    }
}

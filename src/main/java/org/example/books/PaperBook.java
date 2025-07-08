package org.example.books;

public class PaperBook extends Book{

    public PaperBook(String isbn, String TITLE, int PUBLISHYEAR, double PRICE, String AUTHOR , int STOCKQUANTITY) {
        super(isbn, TITLE, PUBLISHYEAR, PRICE, AUTHOR);
        sellable = true;
        stockQuantity = STOCKQUANTITY;
    }
}

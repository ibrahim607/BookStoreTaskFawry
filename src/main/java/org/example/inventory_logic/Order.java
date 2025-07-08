package org.example.inventory_logic;

public class Order {
    private String bookTitle;
    private String authorName;
    private int quantity;
    private double unitPrice;

    public Order(String bookTitle, String authorName, int quantity, double unitPrice) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return " bookTitle" + " / by: " + authorName +
                "\n Quantity: " + quantity +
                "\n Unit Price: " + unitPrice +
                "\n Total: " + getTotal() + " EGP" +
                "\n -----------------------------";
    }
}

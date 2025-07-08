package org.example.inventory_logic;

import org.example.Customer;
import org.example.books.Book;
import org.example.services.MailService;
import org.example.services.ShippingService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Book> bookStock = new ArrayList<>();
    private Customer customer;
    private List<Order> orders = new ArrayList<>();

    public Inventory(Customer customer) {
        this.customer = customer;
    }

    public void addBook(Book book , int quantity){
        bookStock.add(book);
        System.out.println("Book added successfully");
    }

    public void buyBook(String ISBN , int quantity){
        Book book = null;
        for (Book b : bookStock) {
            if (b.getISBN().equals(ISBN)) {
                book = b;
                break;
            }
        }

        if (book == null){
            throw new RuntimeException("Book with ISBN " + ISBN + " Not Found!");
        }

        if (!book.isSellable()){
            System.out.println("Demo books cannot be bought!");
            return;
        }

        if (book.isSellable() && book.getStockQuantity() != 0){
            if (book.getStockQuantity() < quantity) {
            throw new RuntimeException("Stock isnt enough for the purchase");
            }
            ShippingService shippingService = new ShippingService();
            shippingService.finalizePurchase(book , customer.getAddress(),quantity);
            book.setStockQuantity(book.getStockQuantity()-quantity);
        } else if ( book.isSellable() && book.getStockQuantity() == 0){
            MailService mailService = new MailService();
            mailService.finalizePurchase(book , customer.getEmail());
        }
        orders.add(new Order(book.getTitle(), book.getAuthor(), quantity, book.getPrice()));
    }

    public List<Book> removeOutdated(int year){
        List<Book> removedBooks = new ArrayList<>();
        Iterator<Book> iterator = bookStock.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getPublishYear() < year) {
                removedBooks.add(book);
                iterator.remove();
            }
        }
        return removedBooks;
    }

    public void printReceipt() {
        System.out.println("Quantum book store - Full Receipt:");
        double total = 0;
        for (Order order : orders) {
            System.out.println(order);
            total += order.getTotal();
        }
        System.out.println("Total paid: " + total + " EGP");
    }

}

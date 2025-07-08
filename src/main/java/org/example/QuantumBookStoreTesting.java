package org.example;

import org.example.books.Book;
import org.example.books.DemoBook;
import org.example.books.Ebook;
import org.example.books.PaperBook;
import org.example.inventory_logic.Inventory;

import java.util.List;

public class QuantumBookStoreTesting {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setEmail("customer@example.com");
        customer.setAddress("123 Main St, Cairo");

        Inventory inventory = new Inventory(customer);

        PaperBook paperBook = new PaperBook("PB101", "Clean Code", 2015, 300.0, "Robert C. Martin", 10);
        Ebook ebook = new Ebook("EB202", "Effective Java", 2020, 250.0, "Joshua Bloch", "PDF");
        DemoBook demoBook = new DemoBook("DB303", "Sample Java Book", 2012, 0.0, "Unknown Author");

        inventory.addBook(paperBook, 10);
        inventory.addBook(ebook, 0);
        inventory.addBook(demoBook, 0);

        inventory.buyBook("PB101", 2);
        inventory.buyBook("EB202", 1);
        inventory.buyBook("DB303", 1);

        try {
            inventory.buyBook("PB101", 100);
        } catch (RuntimeException e) {
            System.out.println("Quantum book store - ERROR: " + e.getMessage());
        }

        try {
            inventory.buyBook("Non_existing_ISNB", 1);
        } catch (RuntimeException e) {
            System.out.println("Quantum book store - ERROR: " + e.getMessage());
        }

        List<Book> removed = inventory.removeOutdated(2016);
        System.out.println("Quantum book store - Removed outdated books:");
        for (Book book : removed) {
            System.out.println("- " + book.getTitle() + " (" + book.getPublishYear() + ")");
        }

        inventory.printReceipt();
    }
}

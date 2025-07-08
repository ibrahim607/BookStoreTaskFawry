# Quantum Book Store

Welcome to **Quantum Book Store** – a simple Java project that simulates how an online bookstore works.

It supports three types of books:

- **Paper Books**: Have stock and get delivered to a shipping address.
- **EBooks**: Sent via email in a specific file format.
- **Demo Books**: Just for display — not for sale.

## What you can do

- Add books to the store (with ISBN, title, year, author, price)
- Remove outdated books (older than a specific year)
- Buy books by ISBN (with email and address)
  - Paper books are shipped.
  - EBooks are emailed.
  - Demo books can't be bought.
- Get a full receipt showing total purchases.

## How it works

Books are stored in an inventory. Each time a purchase is made:
- Stock is reduced (for paper books)
- Total amount is calculated
- The receipt shows all the books you bought and what you paid

## Testing the system
The class `QuantumBookStoreTesting` does all the following:
- Adds paper, ebook, and demo books
- Buys books with various conditions
- Tries buying unavailable or outdated books
- Prints a receipt of everything bought

## Project Structure
- `Book` (abstract base class)
- `PaperBook`, `EBook`, `DemoBook` (subclasses)
- `Inventory` (handles all operations)
- `ShippingService` and `MailService` (simulate delivery)
- `Order` (used to track purchases and calculate total)
- `QuantumBookStoreTesting` (main class to run and test the app)

## Author
Created by [Ibrahim](https://github.com/ibrahim607)

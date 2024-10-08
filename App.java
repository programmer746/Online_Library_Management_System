package com.example.library;

import com.example.library.model.Book;
import com.example.library.service.ItemService;

public class App {

    public static void main(String[] args) {
        // Create a new ItemService instance
        ItemService service = new ItemService();
        
        // Create a new Book instance
        Book book = new Book();
        book.setTitle("Python Programming");
        book.setAuthor("Varun G");
        book.setIsbn("2200030746");
        
        Book book1 = new Book();
        book1.setTitle("C Programming");
        book1.setAuthor("Denis Richie");
        book1.setIsbn("1234567890");
        // Save the book using the ItemService
        service.saveItem(book);
        service.saveItem(book1);
    }
}
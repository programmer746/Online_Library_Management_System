package com.example.library.service;

import com.example.library.model.Item;

public class ItemService {

    // Method to save an item
    public void saveItem(Item item) {
        // Simulate saving the item (e.g., to a database)
        System.out.println("Saving item: " + item.getTitle());
    }
}

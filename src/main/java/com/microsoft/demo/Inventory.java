package com.microsoft.demo;

public class Inventory {

    private final String category;
    private final InventoryItem[] items;

    public Inventory(String category, InventoryItem[] items) {
        this.category = category;
        this.items = items;
    }

    public String getCetegory() {
        return this.category;
    }

    public InventoryItem[] getItems() {
        return this.items;
    }
}
package com.microsoft.demo;

public class InventoryItem {

    private final double price;
    private final String name;
    
    public InventoryItem(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}

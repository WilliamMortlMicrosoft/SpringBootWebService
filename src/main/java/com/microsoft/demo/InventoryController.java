package com.microsoft.demo;

import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    // called after construction, used for initialization
    @PostConstruct
    public void initialize() {
    }

    @RequestMapping("/inventory")
    public Inventory inventory(@RequestParam(value="category", defaultValue="phones") String category) {
        
    	// stubbed data, this is where we would do a database lookup
    	InventoryItem[] items = new InventoryItem[3];
        items[0] = new InventoryItem(500.50, "iPhone 7");
        items[1] = new InventoryItem(600.50, "Samsung Galaxy");
        items[2] = new InventoryItem(999.99, "iPhone XR");    	
    	
        return new Inventory(category, items);
    }
}

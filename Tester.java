/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */
public class Tester {
    public static void main(String[] args) {
        
        Product product1 = new Product("1 Litre of Water", 1, 0.50, "Evian", "Beverages", "1Kg", "15th March 2026");
        Product product2 = new Product("500ml of Orange Juice", 2, 2.50, "Tropicana", "Beverages", "170g", "15th October 2024");
        // Create instances of products
        
        Inventory inventory = new Inventory();
        inventory.addProduct(product1, 50);
        inventory.addProduct(product2, 30);
        // Create an inventory and add products

        InventoryManager inventoryManager = new InventoryManager(inventory);
        // Create another inventory manager

        inventory.printInventory();
        // Print current inventory

        inventoryManager.addStock(product1, 40);
        // Add 10 units of product1

        inventory.printInventory();
        // Print updated inventory

        inventoryManager.removeStock(product2, 20);
        // Remove 5 units from product2

        inventory.printInventory();
        // Print updated inventory

    }
}





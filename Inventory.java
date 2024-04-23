/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */
import java.util.HashMap;
//Importing the hashmap(dictonary)

public class Inventory {
    private HashMap<Product, Integer> productStock;

    public Inventory() {
        productStock = new HashMap<>();
        //Creating a constructor to allow for a new HashMap named 'productStock
    }

    public void addProduct(Product product, int quantity) {
        productStock.put(product, quantity);
        //A method to add to the inventory alongside its quantity
    }

    public void removeProduct(Product product) {
        productStock.remove(product);
        //A method to remove a product from the inventory
    }

    public int getProductQuantity(Product product) {
        return productStock.getOrDefault(product, 0);
        //A method used to find the stock of a product within the inventory
    }

    public HashMap<Product, Integer> getProductStock() {
        return productStock;
        //A method used by the caller to retrive the entire 'productStock' list
    }

    public void printInventory() {
        System.out.println("Current Inventory:");
        for (HashMap.Entry<Product, Integer> entry : productStock.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product.getProductName() + " - Quantity: " + quantity);
        }
    }
}



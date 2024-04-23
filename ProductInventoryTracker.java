/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Owner
 */
import java.util.HashMap;
import java.util.Scanner;
//importing necessary libraries

public class ProductInventoryTracker {
//The main class of the entire program
    
    public static void main(String[] args) {

        Product Product1 = new Product("1 Litre of Water", 1, 0.50, "Evian", "Beverages", "1Kg", "15th March 2026");
        Product Product2 = new Product("500ml of Orange Juice", 2, 2.50, "Tropicana", "Beverages", "170g", "15th October 2024 ");
        Product Product3 = new Product("12 Pack of Black Tea", 3, 0.80, "Twinnings", "Beverages", "40g", "15th January 2025");
        Product Product4 = new Product("1 Pint of Milk", 4, 1.20, "Cravendale", "Beverages", "480g", "18th March 2024");
        Product Product5 = new Product("500ml of Coconut Water", 5, 0.80, "Vita Coco", "Beverages", "Beverages", "22nd March 2025");
        Product Product6 = new Product("Raspberries", 6, 2.50, "Michael's Mini Market", "Fruits", "150g", "28th March 2024");
        Product Product7 = new Product("Granny Smith Apple", 7, 0.60, "(Michael's Mini Market)", "Fruits", "160g", "");
        Product Product8 = new Product("Mango", 8, 1.85, "Michael's Mini Market", "Fruits", "303g", "5th April 2024");
        Product Product9 = new Product("Banana", 9, 0.18, "Michael's Mini Market", "Fruits", "118g", "2nd April 2024");
        Product Product10 = new Product("Orange", 10, 0.35, "Michael's Mini Market", "Fruits", "150g", "22nd April 2024");
        Product Product11 = new Product("Carrot", 11, 0.10, "Michael's Mini Market", "Vegetables", "61g", "22nd April 2024");
        Product Product12 = new Product("Onion", 12, 0.12, "Michael's Mini Market", "Vegetables", "150g", "22nd May 2024");
        Product Product13 = new Product("Tin of Corn", 13, 1.00, "Green Giant", "Vegetables", "198g", "22nd April 2027");
        Product Product14 = new Product("Red Pepper", 14, 0.59, "Michael's Mini Market", "Vegetables", "160g", "5th April 2024");
        Product Product15 = new Product("Cucumber", 15, 0.35, "Michael's Mini Market", "Vegetables", "301g", "30th March 2024");
        Product Product16 = new Product("Whole Chicken", 16, 0.35, "Michael's Mini Market", "Fresh Meat", "1.2Kg", "25th March 2024");
        Product Product17 = new Product("Beef Mince", 17, 4.50, "Michael's Mini Market", "Fresh Meat", "500g", "29th March 2024");
        Product Product18 = new Product("15 Beef Meatballs", 18, 4.00, "Michael's Mini Market", "Fresh Meat", "400g", "28th March 2024");
        Product Product19 = new Product("8 Pork Sausages", 19, 3.50, "Michael's Mini Market", "Fresh Meat", "301g", "30th March 2024");
        Product Product20 = new Product("Lamb Shank", 20, 8.00, "Michael's Mini Market", "Fresh Meat", "800g", "28th March 2024");
        //Creating intstances of the products with their personalised attributes
        
        Inventory inventory = new Inventory();
        //Creating an instance of an inventory to manage the products
        
        inventory.addProduct(Product1, 97);
        inventory.addProduct(Product2, 31);
        inventory.addProduct(Product3, 8);
        inventory.addProduct(Product4, 20);
        inventory.addProduct(Product5, 3);
        inventory.addProduct(Product6, 33);
        inventory.addProduct(Product7, 12);
        inventory.addProduct(Product8, 36);
        inventory.addProduct(Product9, 34);
        inventory.addProduct(Product10, 22);
        inventory.addProduct(Product11, 5);
        inventory.addProduct(Product12, 9);
        inventory.addProduct(Product13, 20);
        inventory.addProduct(Product14, 13);
        inventory.addProduct(Product15, 41);
        inventory.addProduct(Product16, 11);
        inventory.addProduct(Product17, 4);
        inventory.addProduct(Product18, 3);
        inventory.addProduct(Product19, 3);
        inventory.addProduct(Product20, 6);
        //Assigning quantities to each product that will be placed into the inventory

 System.out.println("Welcome to Michael's Mini Market Product Inventory Tracker!");
 //A greeting for the user 
        Scanner scanner = new Scanner(System.in);
        //Creating a scanner in order to read user input
        
        System.out.print("Please enter the name of the product you're looking for: ");
        String productName = scanner.nextLine();
        //User enters the name of the product they're searching for, their input is searched for by the scanner
        
        boolean found = false;
        //This creates a flag in order to track if the product is found within the inventory
        for (HashMap.Entry<Product, Integer> entry : inventory.getProductStock().entrySet()) {
            //This retrives the inventory list and loops through the code until the desired input (product) if found
            Product product = entry.getKey();
            //Gets the product from the entry
            int quantity = entry.getValue();
            //Gets the quantity from the entry
            if (product.getProductName().equalsIgnoreCase(productName)) {
                //Checking if the product name matches the input (not case sensative)
                System.out.println("Product: " + product.getProductName() + ", Quantity: " + quantity);
                //If found, the products name and quantity will be printed
                found = true;
                //Changes the flag to true as the product has been found
                break;
                //Exits the loop if the product has been found
            }
        }
        
        if (!found) {
            System.out.println("The product has not been found in the inventory.");
            //If the product isn't found in the inventory, print that it hasn't been found
        }

        scanner.close();
        //Closing the scanner in order to save resouces and prevent potential leaks
    }
}

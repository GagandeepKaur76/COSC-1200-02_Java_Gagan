/* *************************************************
Title:      Assignment 4
Author:     Gagandeep Kaur
Date:       April 1, 2024
Purpose:    Inheritance, Data Validation, and Exception Handling
************************************************* */

public class Product {

    // Private attributes of Product
    private int SKU;
    private String ProductName;
    private double ProductCost;
    private int ProductInStock;
    private int ProductToOrder;
    private String SpecialInstructions;

    // Default constructor
    public Product() {
        // Initialize default values
        this.SKU = 0;
        this.ProductName = "Na";
        this.ProductCost = 0;
        this.ProductToOrder = 0;
        this.ProductInStock = 0;
        this.SpecialInstructions = "Na";
    }

    // Parameterized constructor
    public Product(int SKU, String ProductName, double ProductCost, int ProductInStock, int ProductToOrder, String SpecialInstructions) {
        // Initialize attributes with provided values
        this.SKU = SKU;
        this.ProductName = ProductName;
        this.ProductCost = ProductCost;
        this.ProductToOrder = ProductToOrder;
        this.ProductInStock = ProductInStock;
        this.SpecialInstructions = SpecialInstructions;
    }

    // Getter methods
    public int get_sku() {
        return this.SKU;
    }

    public String get_Name() {
        return this.ProductName;
    }

    public double get_ProductCost() {
        return this.ProductCost;
    }

    public int get_ProductInStock() {
        return this.ProductInStock;
    }

    public int get_ProductToOrder() {
        return this.ProductToOrder;
    }

    public String get_SpecialInstructions() {
        return this.SpecialInstructions;
    }

    // Setter methods
    public void set_sku(int SKU) {
        this.SKU = SKU;
    }

    public void set_Name(String ProductName) {
        this.ProductName = ProductName;
    }

    public void set_ProductCost(double ProductCost) {
        this.ProductCost = ProductCost;
    }

    public void set_ProductInStock(int ProductInStock) {
        this.ProductInStock = ProductInStock;
    }

    public void set_ProductToOrder(int ProductToOrder) {
        this.ProductToOrder = ProductToOrder;
    }

    public void set_SpecialInstructions(String SpecialInstructions) {
        this.SpecialInstructions = SpecialInstructions;
    }

    // Override ToString method to provide string representation of the Product
    public String ToString() {
        // Construct and return the string representation
        String str = "";
        str += ("SKU:                  " + SKU + "\n");
        str += ("Product Name:         " + ProductName + "\n");
        str += ("Unit Cost:            " + ProductCost + "\n");
        str += ("Quantity on hand:     " + ProductInStock + "\n");
        str += ("Quantity Needed:      " + ProductToOrder + "\n");
        str += ("Special Instructions: " + SpecialInstructions + "\n");
        return str;
    }
}

/* *************************************************
Title:      Assignment 4
Author:     Gagandeep Kaur
Date:       April 1, 2024
Purpose:    Inheritance, Data Validation, and Exception Handling
************************************************* */

import java.text.SimpleDateFormat;
import java.util.Date;

public class PerishableProduct extends Product {

    // Date format string
    public String DATEFORMAT = "dd/MM/yyyy";

    // Expiry date of the perishable product
    private Date ExpiryDate;

    // Default constructor
    public PerishableProduct() {
        // Call the default constructor of the parent class Product
        super();
        // Initialize ExpiryDate to the current date
        this.ExpiryDate = new Date();
    }

    // Parameterized constructor
    public PerishableProduct(int SKU, String ProductName, double ProductCost, int ProductInStock, int ProductToOrder, String SpecialInstructions, Date ExpiryDate) {
        // Call the parameterized constructor of the parent class Product
        super(SKU, ProductName, ProductCost, ProductInStock, ProductToOrder, SpecialInstructions);
        // Set the ExpiryDate
        this.ExpiryDate = ExpiryDate;
    }

    // Setter method for ExpiryDate
    public void set_ExpiryDate(Date ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    // Getter method for ExpiryDate
    public String get_ExpiryDate() {
        // Format the ExpiryDate using the specified DATEFORMAT and return as a string
        return new SimpleDateFormat(DATEFORMAT).format(ExpiryDate);
    }

    // Override the ToString method to include ExpiryDate
    @Override
    public String ToString() {
        // Call the ToString method of the parent class Product
        String str = super.ToString();
        // Append the ExpiryDate to the string
        str += ("Expiry Date:          " + new SimpleDateFormat(DATEFORMAT).format(ExpiryDate)) + "\n";
        // Return the final string
        return str;
    }
}


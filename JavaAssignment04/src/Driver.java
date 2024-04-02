/* *************************************************
Title:      Assignment 4
Author:     Gagandeep Kaur
Date:       April 1, 2024
Purpose:    Inheritance, Data Validation, and Exception Handling
************************************************* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Driver {

    static ArrayList<Product> products = new ArrayList<>();
    static ArrayList<PerishableProduct> perishableproducts = new ArrayList<>();

    public static void main(String[] args) throws ParseException {
        // Create sample products
        createSampleProducts();

        // Main loop
        while (true) {
            DisplayMenu();
            int user_choice = Tools.getIntFromConsole("\nPlease enter your Choice", 1, 4);

            if (user_choice == 1) {
                DisplayProductList();
            } else if (user_choice == 2) {
                DisplayProduct();
            } else if (user_choice == 3) {
                AddProduct();
            } else {
                break;
            }
        }
    }

    // Display the main menu
    public static void DisplayMenu() {
        System.out.print("1.\tDisplay Products List\n" +
                "2.\tDisplay Product\n" +
                "3.\tAdd new Products (both perishable and non-perishable)\n" +
                "4.\tExit\n");
    }

    // Display list of all products
    public static void DisplayProductList() {
        System.out.println("\nProducts List:\n");
        System.out.println("|SKU        |Product Name         |Unit Cost            |Quantity on Hand     |Quantity Needed      |Special Instructions |Expiry Date         ");
        System.out.println("|-----------|---------------------|---------------------|---------------------|---------------------|---------------------|---------------------");
        for (Product product : products) {
            System.out.printf("|%-10s |%-20s |%-20s |%-20s |%-20s | %-20s|  %-20s%n", product.get_sku(), product.get_Name(), ("$" + product.get_ProductCost()), product.get_ProductInStock(), product.get_ProductToOrder(), product.get_SpecialInstructions(), "-");
        }
        for (PerishableProduct perishableProduct : perishableproducts) {
            System.out.printf("|%-10s |%-20s |%-20s |%-20s |%-20s | %-20s|  %-20s%n", perishableProduct.get_sku(), perishableProduct.get_Name(), ("$" + perishableProduct.get_ProductCost()), perishableProduct.get_ProductInStock(), perishableProduct.get_ProductToOrder(), perishableProduct.get_SpecialInstructions(), perishableProduct.get_ExpiryDate());
        }
        System.out.println("\n");
    }

    // Display details of a specific product
    public static void DisplayProduct() {
        while (true) {
            int user_input_sku = Tools.getIntFromConsole("Please Enter Product SKU: ");
            boolean product_found = false;

            for (Product product : products) {
                if (user_input_sku == product.get_sku()) {
                    System.out.print("\n" + product.ToString() + "\n");
                    product_found = true;
                    break;
                }
            }

            if (!product_found) {
                for (PerishableProduct perishableproduct : perishableproducts) {
                    if (user_input_sku == perishableproduct.get_sku()) {
                        System.out.println("\n" + perishableproduct.ToString() + "\n");
                        product_found = true;
                        break;
                    }
                }
            }

            if (!product_found) {
                System.out.println("\nProduct not in the list !!!\n");
                break;
            }

            if (product_found) {
                break;
            }
        }
    }

    // Add a new product to the inventory
    public static void AddProduct() {
        int user_choice = Tools.getIntFromConsole("Add a new Product\n1. Non-perishable Product\n2. Perishable Product\nPlease enter your choice", 1, 2);

        if (user_choice == 1) {
            Product p = new Product();
            p.set_sku(Tools.getIntFromConsole("Please Enter Product SKU: "));
            p.set_Name(Tools.getStringFromConsole("Please Enter Product Name: "));
            p.set_ProductCost(Tools.getDblFromConsole("Please Enter Product Unit Cost:"));
            p.set_ProductInStock(Tools.getIntFromConsole("Please Enter Product Quantity on Hand: "));
            p.set_ProductToOrder(Tools.getIntFromConsole("Please Enter Product Quantity To Order: "));
            p.set_SpecialInstructions(Tools.getStringFromConsole("Please Enter Product Special Instructions: "));
            products.add(p);

        } else {
            PerishableProduct p = new PerishableProduct();

            p.set_sku(Tools.getIntFromConsole("Please Enter Product SKU:"));
            p.set_Name(Tools.getStringFromConsole("Please Enter Product Name:"));
            p.set_ProductCost(Tools.getDblFromConsole("Please Enter Product Unit Cost:"));
            p.set_ProductInStock(Tools.getIntFromConsole("Please Enter Product Quantity on Hand: "));
            p.set_ProductToOrder(Tools.getIntFromConsole("Please Enter Product Quantity To Order: "));
            p.set_SpecialInstructions(Tools.getStringFromConsole("Please Enter Product Special Instructions: "));

            // Get and validate expiry date
            while (true) {
                String expiry = (Tools.getStringFromConsole("Enter Product Expiry Date (dd/MM/yyyy) : "));
                try {
                    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(expiry);
                    p.set_ExpiryDate(date);
                    break;
                } catch (ParseException e) {
                    System.out.println("Please Enter valid date in the format of dd/MM/yyyy");
                }
            }
            perishableproducts.add(p);
        }
    }

    // Create sample products
    public static void createSampleProducts() throws ParseException {
        Product product1 = new Product(101, "Bag", 10.99, 90, 50, "Handle with care");
        Product product2 = new Product(102, "Tooth Paste", 6.00, 50, 30, "N/A");
        Product product3 = new Product(101, "Pen", 2.50, 150, 200, "N/A");

        products.add(product1);
        products.add(product2);
        products.add(product3);

        PerishableProduct perishableproduct1 = new PerishableProduct(201, "Milk", 2.5, 40, 60, "Keep Refrigerated", new SimpleDateFormat("dd/MM/yyyy").parse("3/4/2024"));
        PerishableProduct perishableproduct2 = new PerishableProduct(202, "Cottage Cheese", 3.6, 32, 78, "Keep Refrigerated", new SimpleDateFormat("dd/MM/yyyy").parse("3/4/2024"));

        perishableproducts.add(perishableproduct1);
        perishableproducts.add(perishableproduct2);
    }
}


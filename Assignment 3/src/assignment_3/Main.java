/* ********************
Title: Assignment 3
Auther: Gagandeep Kaur
Date: Mar 11, 2024
Purpose: Classes and Fuctions
******************** */

package assignment_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Main menu loop
        do {
            displayMainMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Handling user choices
            if (choice == 1) {
                populateCarList();
            } else if (choice == 2) {
                populateServiceList();
            } else if (choice == 3) {
                showCarDetails(scanner);
            } else if (choice == 4) {
                showServiceDetails(scanner);
            } else if (choice == 5) {
                addMaintenance(scanner);
            } else if (choice == 6) {
                showMaintenanceByInvoice(scanner);
            } else if (choice == 7) {
                showAllMaintenance();
            } else if (choice == 8) {
                break;
            } else if (choice == 9) {
                deleteMaintenance(scanner);
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }

    // Displaying the main menu
    private static void displayMainMenu() {
        System.out.println("Main Menu");
        System.out.println("1. Populate Car List");
        System.out.println("2. Populate Service List");
        System.out.println("3. Show Car Details");
        System.out.println("4. Show Service Details");
        System.out.println("5. Add Maintenance");
        System.out.println("6. Show Maintenance by Invoice");
        System.out.println("7. Show All Maintenance");
        System.out.println("8. Your Creative Option");
        System.out.println("9. Delete Maintenance");
        System.out.println("0. Exit");
    }

    // Populating the car list
    private static void populateCarList() {
        // Code provided by Professor Clint MacDonald
        Car.cars = new ArrayList<Car>();
        // Adding cars to the list
        // Each car has properties like year, make, model, etc.
    }

    // Populating the service list
    private static void populateServiceList() {
        // Code provided by Professor Clint MacDonald
        Service.services = new ArrayList<Service>();
        // Adding services to the list
        // Each service has properties like code, description, price, etc.
    }

    // Showing details of a specific car
    private static void showCarDetails(Scanner scanner) {
        System.out.print("Enter VIN to show details: ");
        int vin = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Placeholder logic to find and display car details
    }

    // Showing details of a specific service
    private static void showServiceDetails(Scanner scanner) {
        System.out.print("Enter Service Code to show details: ");
        String serviceCode = scanner.nextLine();

        // Placeholder logic to find and display service details
    }

    // Adding maintenance record
    private static void addMaintenance(Scanner scanner) throws ParseException {
        // Placeholder logic to add maintenance record
    }

    // Showing maintenance details by invoice ID
    private static void showMaintenanceByInvoice(Scanner scanner) {
        // Placeholder logic to show maintenance details by invoice ID
    }

    // Showing all maintenance records
    private static void showAllMaintenance() {
        // Placeholder logic to display all maintenance records
    }

    // Deleting maintenance record
    private static void deleteMaintenance(Scanner scanner) {
        // Placeholder logic to delete maintenance record
    }

    // Helper methods for displaying tables
    private static void displayCarsTable() {
        // Displaying cars table
    }

    private static void displayServicesTable() {
        // Displaying services table
    }

    private static void displayMaintenanceTable() {
        // Displaying maintenance table
    }
}
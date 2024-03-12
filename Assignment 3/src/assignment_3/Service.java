/* ********************
Title: Assignment 3
Auther: Gagandeep Kaur
Date: Mar 11, 2024
Purpose: Classes and Fuctions
******************** */

package assignment_3;

import java.util.ArrayList;

public class Service {

    public static ArrayList<Service> services;
    // Properties
    private String serviceCode;
    private String serviceName;
    private String description;
    private double basePrice;
    private double timeRequired;
    private boolean isActive;

    // Constructors
    // Default Constructor
    public Service() {}

    // Parameterized Constructor
    public Service(String serviceCode, String serviceName, String description, double basePrice, double timeRequired, boolean isActive) {
        setServiceCode(serviceCode);
        setServiceName(serviceName);
        setDescription(description);
        setBasePrice(basePrice);
        setTimeRequired(timeRequired);
        setActive(isActive);
    }

    // Secondary Parameterized Constructor
    public Service(String serviceCode, String serviceName) {
        this(serviceCode, serviceName, "", 0.00, 0.00, false);
    }

    // Getters and Setters
    public String getServiceCode() { return serviceCode; }
    public void setServiceCode(String serviceCode) {
        if (serviceCode.length() == 4) {
            this.serviceCode = serviceCode;
        } else {
            System.out.println("Service code must be 4 characters long.");
        }
    }

    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) {
        if (serviceName.length() <= 50) {
            this.serviceName = serviceName;
        } else {
            System.out.println("Service name exceeds maximum length of 50 characters.");
        }
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getBasePrice() { return basePrice; }
    public void setBasePrice(double basePrice) {

        if (basePrice >= 0.00 && basePrice <= 5000.00) {
            this.basePrice = basePrice;
        } else {
            System.out.println("Base price must be between 0.00 and 5,000.00.");
        }
    }

    public double getTimeRequired() { return timeRequired; }
    public void setTimeRequired(double timeRequired) {
        if (timeRequired >= 0.00 && timeRequired <= 100.00) {
            this.timeRequired = timeRequired;
        } else {
            System.out.println("Time required must be between 0.00 and 100.00.");
        }
    }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    // Instance Methods

    public void flipActive() {

        // change the active state.
        isActive = !isActive;
    }

    private void setDefaults() {

        serviceName = "unknown";
        description = "";
        basePrice = 0.00;
        timeRequired = 0.00;
        isActive = false;
    }

    public String toString() {
        String s = null;
        s =     "\n" +
                "\nserviceCode='" + serviceCode + '\'' +
                "\n, serviceName='" + serviceName + '\'' +
                "\n, description='" + description + '\'' +
                "\n, basePrice=" + basePrice +
                "\n, timeRequired=" + timeRequired +
                "\n, isActive=" + isActive +
                '\n';
        return s;
    }

    // Static Methods

    public static String toTable(ArrayList<Service> services)
    {
        // Reference for StingBuilder - https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
        StringBuilder table = new StringBuilder();
        table.append(String.format("%-15s | %-30s | %-10s | %-10s | %-15s | %-8s\n",
                "Service Code", "Service Name", "Base Price", "Time Required", "Description", "Active"));

        for (Service service : services) {
            table.append(String.format("%-15s | %-30s | %-10.2f | %-10.2f | %-15s | %-8s\n",
                    service.getServiceCode(), service.getServiceName(), service.getBasePrice(),
                    service.getTimeRequired(), service.getDescription(), service.isActive()));
        }
        return table.toString();
    }

    public static double getPrice(String serviceCode, ArrayList<Service> services)
    {
        for (Service service : services) {

            if (service.getServiceCode().equals(serviceCode)) {
                return service.getBasePrice();
            }
        }
        return -1; // Service code not found
    }

    public static Service findService(String serviceCode, ArrayList<Service> services)
    {
        for (Service service : services) {
            if (service.getServiceCode().equals(serviceCode)) {
                return service;
            }
        }
        return null; // Service code not found
    }
}

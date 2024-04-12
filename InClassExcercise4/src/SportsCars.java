/* ************************************************
Title:      ICE 4
Author:     Gagandeep Kaur
Date:       April 12, 2024
Purpose:    Reinforce Java programming fundamentals
************************************************* */

import java.util.ArrayList;

/**
 * Represents a group of sports cars.
 */
public class SportsCars {
    static ArrayList<SportsCars> carsList = new ArrayList<>();
    private static int autoNumber = 1;

    private int id;
    private String brand;
    private String model;
    private int year;

    /**
     * Default constructor.
     */
    public SportsCars() {
        this.id = autoNumber++;
    }

    /**
     * Parameterized constructor.
     * @param brand The brand of the sports car.
     * @param model The model of the sports car.
     * @param year The year of the sports car.
     */
    public SportsCars(String brand, String model, int year) {
        this();
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getters and setters with data validation

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1900 && year <= 2024) { // Example validation
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }
    }

    // Instance method
    public void displayInfo() {
        System.out.println("ID: " + id + ", Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    // Static method
    public static void printAllCars() {
        for (SportsCars car : carsList) {
            car.displayInfo();
        }
    }
}

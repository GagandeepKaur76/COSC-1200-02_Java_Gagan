/* **********************************
File:       In Class Excercise 3
Author:     Gagandeep Kaur
Date:       22 March 2024
Purpose:    In Class Activity of Programming
************************************* */

import java.util.ArrayList;

public class Car {
    public static ArrayList<Car> cars;

    private int vin;
    private int year;
    private String make;
    private String model;
    private String trim;
    private String color;
    private String owner;

    public Car() {
        setDefaults();
    }

    // Constructors, getters, setters, and other methods go here

    // Method to check if a car with given VIN exists
    public static boolean carExists(int vin) {
        if (cars == null) {
            return false;
        }

        for (Car car : cars) {
            if (car.getVin() == vin) {
                return true;
            }
        }

        return false;
    }

    private int getVin() {
        return 0;
    }


    // Set default values for Car
    private void setDefaults() {
        this.vin = AppSettings.Car.DEFAULT_VIN;
        this.year = AppSettings.Car.DEFAULT_YEAR;
        // Set other default values as needed
    }
}

/* ********************
Title: Assignment 3
Auther: Gagandeep Kaur
Date: Mar 11, 2024
Purpose: Classes and Fuctions
******************** */

package assignment_3;

import java.util.ArrayList;

// Car class representing a car entity
public class Car {

    private static int autoVin = 1;

    // ArrayList to hold all cars
    public static ArrayList<Car> cars;

    // Car properties
    private int vin; // Vehicle Identification Number
    private int year; // Year of manufacture
    private String make; // Make of the car (e.g., Honda, Toyota)
    private String model; // Model of the car (e.g., Civic, Camry)
    private String trim; // Trim level of the car (e.g., DX, Hybrid)
    private String color; // Color of the car
    private String owner; // Owner of the car

    // Default constructor
    public Car(){}

    // Parameterized constructor
    public Car(int vin, int year, String make, String model,
               String trim, String color, String owner){
        setVin(vin);
        setYear(year);
        setMake(make);
        setModel(model);
        setTrim(trim);
        setColor(color);
        setOwner(owner);
    }

    // Getters
    public int getVin() { return vin; }
    public int getYear() { return year; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public String getTrim() { return trim; }
    public String getColor() { return color; }
    public String getOwner() { return owner; }

    // Setters
    public void setVin (int vin){
        // Auto-generate VIN if not provided
        if (vin == 0) {
            vin = autoVin++;
        }
        this.vin = vin;
    }
    public void setYear (int year){ this.year = year; }
    public void setMake (String make){ this.make = make; }
    public void setModel (String model){ this.model = model; }
    public void setTrim (String trim){ this.trim = trim; }
    public void setColor (String color){ this.color = color; }
    public void setOwner (String owner){ this.owner = owner; }

    // Method to get details of a single car
    public String toString(int vin) {
        String string = null;
        if (this.vin == vin) {
            string = "\nVIN: " + vin + "\nColor: " + color + "\nYear: " + year +
                    "\nMake: " + make + "\nModel: " + model + "\nOwner: " + owner + "\n";
        } else {
            string = "\nCar not found with VIN: " + vin + "\n";
        }
        return string;
    }

    // Method to represent cars in tabular format
    public static String toTable(ArrayList<Car> cars) {
        StringBuilder table = new StringBuilder();
        table.append("  VIN  | COLOR   | YEAR | MAKE   | MODEL  | OWNER          |\n");
        table.append("-------|---------|------|--------|--------|----------------|\n");

        for (Car car : cars) {
            table.append(String.format("%6d | %-7s | %4d | %-6s | %-6s | %-15s |\n",
                    car.getVin(), car.getColor(), car.getYear(), car.getMake(), car.getModel(), car.getOwner()));
        }

        return table.toString();
    }

    // Bonus method to find a car by VIN
    public static Car findCarByVIN(int vin, ArrayList<Car> cars) {
        Car retCar = new Car();

        for (Car car: cars) {
            if (car.getVin() == vin) {
                retCar = car;
            }
        }
        return retCar;
    }
}


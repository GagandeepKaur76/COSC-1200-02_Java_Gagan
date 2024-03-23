/* **********************************
File:       In Class Excercise 3
Author:     Gagandeep Kaur
Date:       22 March 2024
Purpose:    In Class Activity of Programming
************************************* */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initializeApplication();

        // Sample usage of Maintenance and Car classes
        try {
            Maintenance maintenance = new Maintenance();
            Car car = new Car();
            // Add your further logic here
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Initialize the application
    private static void initializeApplication() {
        // Initialize your application settings
        // You may want to load default values from AppSettings here
    }
}

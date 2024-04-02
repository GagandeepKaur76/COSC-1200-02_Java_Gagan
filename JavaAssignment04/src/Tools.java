/* ************************************************
Title:      Assignment 4
Author:     Gagandeep Kaur
Date:       April 1, 2024
Purpose:    Inheritance, Data Validation, and Exception Handling
************************************************* */


import java.io.IOException;
import java.util.Scanner;
import java.io.Console;

// Main Tools Class for this files
public class Tools {

    // Scanner object for user input
    static Scanner sc = new Scanner(System.in);

    // Method to get integer input from console
    public static int getIntFromConsole(String inputPrompt){

        Scanner s = new Scanner(System.in);

        while(true)
        {
            // Prompt user for input
            System.out.print(inputPrompt);
            String input_string = s.nextLine();

            try
            {
                // Attempt to parse input to integer
                if( Integer.parseInt(input_string) > 0)
                {
                    return Integer.parseInt(input_string);
                }
                else
                {
                    // Notify user if input is not a positive integer
                    System.out.println("\nInput must be a positive Integer.");
                }
            }
            catch(Exception e)
            {
                // Notify user if input is not an integer
                System.out.println("\nInput must be an Integer");
            }

        }
    }

    // Method to get integer input within a specified range from console
    public static int getIntFromConsole(String inputPrompt, int lowerBound, int upperBound) {
        int inputNumber = -1;
        String inputString;

        do {
            // Prompt user for input within specified range
            System.out.print(inputPrompt + " ( " + lowerBound + " - " + upperBound + ") : ");
            inputString = sc.nextLine();

            // Check if input is valid numeric value within specified range
            if (isStringNumeric(inputString, lowerBound, upperBound)) {
                break;
            } else {
                // Notify user if input is not valid
                System.out.println("Your input is not valid\nIt must be an integer between ("+lowerBound+"-"+upperBound+")");
            }
        } while (!isStringNumeric(inputString, lowerBound, upperBound));

        return Integer.parseInt(inputString);
    }

    // Method to get double input from console
    public static double getDblFromConsole(String inputPrompt){

        Scanner s = new Scanner(System.in);

        while(true)
        {
            // Prompt user for input
            System.out.print(inputPrompt);
            String input_string = s.nextLine();

            try
            {
                // Attempt to parse input to double
                if( Double.parseDouble(input_string) > 0)
                {
                    return Double.parseDouble(input_string);
                }
                else
                {
                    // Notify user if input is not a positive double
                    System.out.println("\nInput must be a positive Double.");
                }
            }
            catch(Exception e)
            {
                // Notify user if input is not a double
                System.out.println("\nInput must be a Double");
            }

        }
    }

    // Method to get double input within a specified range from console
    public static double getDblFromConsole(String inputPrompt, int lowerBound, int upperBound) {
        int inputNumber = -1;
        String inputString;

        do {
            // Prompt user for input within specified range
            System.out.print(inputPrompt + " ( " + lowerBound + " - " + upperBound + ") > ");
            inputString = sc.nextLine();
        } while (!isStringDecimal(inputString, lowerBound, upperBound));

        return Double.parseDouble(inputString);
    }

    // Method to get string input from console
    public static String getStringFromConsole(String inputPrompt) {
        // Prompt user for input
        System.out.print(inputPrompt);
        return sc.nextLine();
    }

    // Method to get string input from console when a key is pressed
    public static String getStringKeyPress(String inputPrompt) {
        // Prompt user for input
        System.out.print(inputPrompt + " > ");
        String keyPressed = "";

        try {
            // Read key press from console
            keyPressed = String.valueOf(System.console().reader().read());
        } catch(IOException ioe) {
            // Notify user if error occurs
            System.out.println("Error: " + ioe.toString());
        }

        return keyPressed;
    }

    // Method to check if a string is numeric
    private static boolean isStringDecimal(String inputString) {
        boolean isValid = true;

        try {
            // Attempt to parse input to double
            double testNumber = Double.parseDouble(inputString);
        } catch (NumberFormatException e) {
            // Set validity to false if parsing fails
            isValid = false;
        }

        return isValid;
    }

    // Method to check if a string is numeric and within a specified range
    private static boolean isStringNumeric(String inputString, int lowerBound, int upperBound) {
        int testNumber;

        // Attempt to parse input to integer
        try {
            testNumber = Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            // Return false if parsing fails
            return false;
        }

        // Check if parsed integer is within specified range
        return testNumber <= upperBound && testNumber >= lowerBound;
    }

    // Method to check if a string is decimal and within a specified range
    private static boolean isStringDecimal(String inputString, double lowerBound, double upperBound) {
        double testNumber;

        // Attempt to parse input to double
        try {
            testNumber = Double.parseDouble(inputString);
        } catch (NumberFormatException e) {
            // Return false if parsing fails
            return false;
        }

        // Check if parsed double is within specified range
        return testNumber <= upperBound && testNumber >= lowerBound;
    }

}


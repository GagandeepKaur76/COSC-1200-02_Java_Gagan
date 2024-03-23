/* **********************************
File:       In Class Excercise 3
Author:     Gagandeep Kaur
Date:       22 March 2024
Purpose:    In Class Activity of Programming
************************************* */

import java.util.ArrayList;
import java.util.Date;

public class Maintenance {
    public static ArrayList<Maintenance> maintenances;
    public static int nextInvoiceID = 1001;

    private int invoiceID;
    private int carVin;
    private String serviceCode;
    private double price;
    private Date date;
    private String notes;

    public Maintenance() {
        this.invoiceID = nextInvoiceID;
        nextInvoiceID += 13;
        this.carVin = AppSettings.Car.DEFAULT_VIN;
        this.serviceCode = AppSettings.Maintenance.DEFAULT_SERVICE_CODE;
        this.price = AppSettings.Maintenance.DEFAULT_PRICE;
        this.date = new Date();
        this.notes = AppSettings.Maintenance.DEFAULT_NOTES;
    }

    // Constructors, getters, setters, and other methods go here

    // Method to check if a maintenance with given invoice ID exists
    public static boolean maintenanceExists(int invoiceID) {
        for (Maintenance maintenance : maintenances) {
            if (maintenance.getInvoiceID() == invoiceID) {
                return true;
            }
        }
        return false;
    }

    private int getInvoiceID() {
        return 0;
    }
}

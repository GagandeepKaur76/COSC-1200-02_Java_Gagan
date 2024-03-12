/* ********************
Title: Assignment 3
Auther: Gagandeep Kaur
Date: Mar 11, 2024
Purpose: Classes and Fuctions
******************** */

package assignment_3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Maintenance {

    // ArrayList to hold all maintenance records
    public static ArrayList<Maintenance> maintenances;

    // Static variable to generate next invoice ID
    public static int nextInvoiceID = 1001;

    // Maintenance properties
    private int invoiceID; // Invoice ID
    private int carVin; // Vehicle Identification Number (VIN) of the car
    private String serviceCode; // Service code
    private double price; // Price of the service
    private Date date; // Date of maintenance
    private String notes; // Additional notes

    // Default constructor
    public Maintenance() {
        this.invoiceID = nextInvoiceID;
        // Autoincrements
        nextInvoiceID += 13;
        this.carVin = 0;
        this.serviceCode = "na";
        this.price = 0.00;
        // Set relative date
        this.date = new Date();
        this.notes = "";
    }

    // Parameterized constructor
    public Maintenance(int carVin, String serviceCode, double price, Date date, String notes) {
        this.invoiceID = nextInvoiceID;
        // Autoincrements
        nextInvoiceID += 13;
        this.carVin = carVin;
        this.serviceCode = serviceCode;
        this.price = price;
        this.date = date;
        this.notes = notes;
    }

    // Setters
    public void setInvoiceID(int ID) {
        this.invoiceID = ID;
    }
    public void setCarVin(int Vin) {
        this.carVin = Vin;
    }
    public void setServiceCode(String code) {
        this.serviceCode = code;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    // Getters
    public int getInvoiceID() {
        return this.invoiceID;
    }
    public int getCarVin() {
        return this.carVin;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }
    public double getPrice() {
        return this.price;
    }
    public Date getDate() {
        return this.date;
    }
    public String getNotes() {
        return this.notes;
    }

    // Instance method to represent maintenance as a string
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return String.format("Invoice ID: %d\nCar VIN: %d\nService Code: %s\nPrice: %.2f\nDate: %s\nNotes: %s",
                invoiceID, carVin, serviceCode, price, dateFormat.format(date), notes);
    }

    // Static method to represent maintenance records in tabular format
    public static String toTable(ArrayList<Maintenance> maintenanceList) {
        StringBuilder table = new StringBuilder();
        table.append("  Invoice ID  |   Car VIN    | Service Code  |   Price   |    Date    | Notes           \n");
        table.append("--------------|--------------|---------------|-----------|------------|-----------------\n");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        for (Maintenance maintenance : maintenanceList) {
            table.append(String.format("%12d | %12d | %-13s | %-9.2f | %-10s | %-15s\n",
                    maintenance.getInvoiceID(), maintenance.getCarVin(), maintenance.getServiceCode(),
                    maintenance.getPrice(), dateFormat.format(maintenance.getDate()), maintenance.getNotes()));
        }

        return table.toString();
    }

    // BONUS ADVANCED: Static method to get a Maintenance object given an invoiceID
    public static Maintenance getMaintenanceByInvoiceID(int invoiceID, ArrayList<Maintenance> maintenanceList) {
        for (Maintenance maintenance : maintenanceList) {
            if (maintenance.getInvoiceID() == invoiceID) {
                return maintenance;
            }
        }
        return null;
    }
}



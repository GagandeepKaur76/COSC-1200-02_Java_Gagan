/* **********************************
File:       In Class Excercise 3
Author:     Gagandeep Kaur
Date:       22 March 2024
Purpose:    In Class Activity of Programming
************************************* */

import java.util.ArrayList;

public class Service {
    public static ArrayList<Service> services;

    private String serviceCode;
    private String serviceName;
    private String description;
    private double basePrice;
    private double timeRequired;
    private boolean isActive;

    public Service() {
        setDefaults();
    }

    // Constructors, getters, setters, and other methods go here

    // Method to check if a service with given service code exists
    public static boolean serviceExists(String serviceCode) {
        for (Service service : services) {
            if (service.getServiceCode().equals(serviceCode)) {
                return true;
            }
        }
        return false;
    }

    private Object getServiceCode() {
        return null;
    }

    // Set default values for Service
    private void setDefaults() {
        this.serviceCode = AppSettings.Service.DEFAULT_SERVICE_CODE;
        this.serviceName = AppSettings.Service.DEFAULT_NAME;
        this.description = AppSettings.Service.DEFAULT_DESCRIPTION;
        this.basePrice = AppSettings.Service.DEFAULT_BASE_PRICE;
        this.timeRequired = AppSettings.Service.DEFAULT_TIME_REQUIRED;
        this.isActive = AppSettings.Service.DEFAULT_IS_ACTIVE;
    }
}

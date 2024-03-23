/* **********************************
File:       In Class Excercise 3
Author:     Gagandeep Kaur
Date:       22 March 2024
Purpose:    In Class Activity of Programming
************************************* */

import java.time.LocalDate;

public class AppSettings {
    public static final String APP_AUTHOR = "Gagandeep Kaur";
    public static final LocalDate APP_VERSION_DATE = LocalDate.of(2024, 3, 18);

    public static class Service {
        public static final int SERVICE_CODE_LENGTH = 4;
        public static final double MIN_BASE_PRICE = 0f;
        public static final double MAX_BASE_PRICE = 5000f;

        public static final String DEFAULT_SERVICE_CODE = "";
        public static final String DEFAULT_NAME = "";
        public static final String DEFAULT_DESCRIPTION = "";
        public static final double DEFAULT_BASE_PRICE = 0f;
        public static final double DEFAULT_TIME_REQUIRED = 0f;
        public static final boolean DEFAULT_IS_ACTIVE = false;
    }

    public static class Car {
        public static final int DEFAULT_YEAR = -1; // Assuming a default year of -1 means uninitialized
        public static final int DEFAULT_VIN = 0 ;
        // Add other default settings for Car here
    }

    public static class Maintenance {
        public static final String DEFAULT_SERVICE_CODE = "";
        public static final double DEFAULT_PRICE = 0.0;
        public static final String DEFAULT_NOTES = "";
        // Add other default settings for Maintenance here
    }
}


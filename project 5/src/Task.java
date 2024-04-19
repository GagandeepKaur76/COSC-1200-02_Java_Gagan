/* ************************************************
Title:      Assignment 5
Author:     Gagandeep Kaur
Date:       April 18, 2024
Purpose:    Swing Windows App and File IO
************************************************* */


// Task.java
// This class represents a task with a title and description
public class Task {
    private String title; // Title of the task
    private String description; // Description of the task

    // Constructor to initialize a task with a title and description
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getter method to retrieve the title of the task
    public String getTitle() {
        return title;
    }

    // Setter method to set the title of the task
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method to retrieve the description of the task
    public String getDescription() {
        return description;
    }

    // Setter method to set the description of the task
    public void setDescription(String description) {
        this.description = description;
    }
}


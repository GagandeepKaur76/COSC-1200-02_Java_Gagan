/* ************************************************
Title:      Assignment 5
Author:     Gagandeep Kaur
Date:       April 18, 2024
Purpose:    Swing Windows App and File IO
************************************************* */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList; // Import ArrayList here

// TaskManagerApp class manages the Task Manager application
public class TaskManagerApp {
    private ArrayList<Task> taskList; // List to hold tasks
    private int currentTaskIndex; // Index of the currently displayed task
    private TaskGUI taskGUI; // Graphical user interface

    // Constructor to initialize the application
    public TaskManagerApp() {
        taskList = new ArrayList<>();
        currentTaskIndex = 0;
        taskGUI = new TaskGUI();

        // Load tasks from file
        loadTasksFromFile();

        // Populate GUI with first task
        displayCurrentTask();

        // Set up event listeners
        setupEventListeners();
    }

    // Load tasks from file
    private void loadTasksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    taskList.add(new Task(parts[0], parts[1]));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading tasks from file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Save tasks to file
    private void saveTasksToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tasks.txt"))) {
            for (Task task : taskList) {
                writer.write(task.getTitle() + "," + task.getDescription());
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Task saved successfully to file", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving tasks to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Navigate to the previous task
    private void navigateBack() {
        if (currentTaskIndex > 0) {
            currentTaskIndex--;
            displayCurrentTask();
        }
    }

    // Navigate to the next task
    private void navigateForward() {
        if (currentTaskIndex < taskList.size() - 1) {
            currentTaskIndex++;
            displayCurrentTask();
        }
    }

    // Save the current task
    private void saveCurrentTask() {
        Task currentTask = taskList.get(currentTaskIndex);
        currentTask.setTitle(taskGUI.getTitleField().getText());
        currentTask.setDescription(taskGUI.getDescriptionField().getText());
        JOptionPane.showMessageDialog(null, "Task saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    // Display the current task on the GUI
    private void displayCurrentTask() {
        Task currentTask = taskList.get(currentTaskIndex);
        taskGUI.updateTaskNumber(currentTaskIndex + 1);
        taskGUI.updateTitle(currentTask.getTitle());
        taskGUI.updateDescription(currentTask.getDescription());
    }

    // Set up event listeners for GUI buttons
    private void setupEventListeners() {
        taskGUI.getBackButton().addActionListener(e -> navigateBack());
        taskGUI.getForwardButton().addActionListener(e -> navigateForward());
        taskGUI.getSaveButton().addActionListener(e -> saveCurrentTask());
        taskGUI.getSaveToFileButton().addActionListener(e -> saveTasksToFile());
    }

    // Main method to start the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TaskManagerApp());
    }
}





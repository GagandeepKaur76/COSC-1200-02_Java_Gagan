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

// TaskGUI class represents the graphical user interface of the Task Manager application
public class TaskGUI {
    private JFrame frame; // Main application window
    private JTextField taskNumberField; // Field to display task number
    private JButton backButton; // Button to navigate to the previous task
    private JButton forwardButton; // Button to navigate to the next task
    private JTextField titleField; // Field to display/edit task title
    private JTextField descriptionField; // Field to display/edit task description
    private JButton saveButton; // Button to save the current task
    private JButton saveToFileButton; // Button to save tasks to file

    // Constructor to initialize the GUI
    public TaskGUI() {
        // Initialize GUI components
        frame = new JFrame();
        JLabel taskNumberLabel = new JLabel("Task Number:");
        taskNumberField = new JTextField(10);
        backButton = new JButton("Back");
        forwardButton = new JButton("Forward");
        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField(20);
        JLabel descriptionLabel = new JLabel("Description:");
        descriptionField = new JTextField(20);
        saveButton = new JButton("Save Task");
        saveToFileButton = new JButton("Save to File");

        // Set up layout using GridLayout
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
        panel.add(taskNumberLabel);
        panel.add(taskNumberField);
        panel.add(backButton);
        panel.add(forwardButton);
        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(descriptionLabel);
        panel.add(descriptionField);

        // Add buttons to a separate panel with FlowLayout
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(saveButton);
        buttonPanel.add(saveToFileButton);

        // Add panels to the frame
        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Set window properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Task Manager");
        frame.pack();
        frame.setVisible(true);

        setupKeyBindings();
    }

    // Update the displayed task number
    public void updateTaskNumber(int taskNumber) {
        taskNumberField.setText(String.valueOf(taskNumber));
    }

    // Update the displayed title
    public void updateTitle(String title) {
        titleField.setText(title);
    }

    // Update the displayed description
    public void updateDescription(String description) {
        descriptionField.setText(description);
    }

    // Get the Back button
    public JButton getBackButton() {
        return backButton;
    }

    // Get the Forward button
    public JButton getForwardButton() {
        return forwardButton;
    }

    // Get the Save button
    public JButton getSaveButton() {
        return saveButton;
    }

    // Get the Save to File button
    public JButton getSaveToFileButton() {
        return saveToFileButton;
    }

    // Get the title text field
    public JTextField getTitleField() {
        return titleField;
    }

    // Get the description text field
    public JTextField getDescriptionField() {
        return descriptionField;
    }

    // Set up key bindings
    private void setupKeyBindings() {
        InputMap inputMap = frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = frame.getRootPane().getActionMap();

        // Bind Esc key to close the window
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "closeWindow");
        actionMap.put("closeWindow", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the window
            }
        });
    }
}


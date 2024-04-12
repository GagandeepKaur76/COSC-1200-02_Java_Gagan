/* ************************************************
Title:      ICE 4
Author:     Gagandeep Kaur
Date:       April 12, 2024
Purpose:    Reinforce Java programming fundamentals
************************************************* */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * GUI for displaying sports cars information.
 */
public class SportsCarsGUI extends JFrame {
    private JComboBox<String> comboBox;
    private JTextArea detailsTextArea;

    private ArrayList<SportsCars> carsList;

    public SportsCarsGUI() {
        setTitle("Sports Cars Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Instantiate the cars
        carsList = new ArrayList<>();
        carsList.add(new SportsCars("Ferrari", "488 GTB", 2019));
        carsList.add(new SportsCars("Porsche", "911", 2020));
        carsList.add(new SportsCars("Lamborghini", "Aventador", 2018));
        carsList.add(new SportsCars("Aston Martin", "DB11", 2017));
        carsList.add(new SportsCars("McLaren", "720S", 2021));

        JPanel panel = new JPanel(new BorderLayout());

        comboBox = new JComboBox<>();
        for (SportsCars car : carsList) {
            comboBox.addItem(car.getBrand() + " " + car.getModel());
        }
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboBox.getSelectedIndex();
                if (selectedIndex != -1) {
                    SportsCars selectedCar = carsList.get(selectedIndex);
                    detailsTextArea.setText("ID: " + selectedCar.getId() + "\nBrand: " + selectedCar.getBrand() +
                            "\nModel: " + selectedCar.getModel() + "\nYear: " + selectedCar.getYear());
                }
            }
        });

        panel.add(comboBox, BorderLayout.NORTH);

        detailsTextArea = new JTextArea();
        detailsTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(detailsTextArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SportsCarsGUI();
            }
        });
    }
}

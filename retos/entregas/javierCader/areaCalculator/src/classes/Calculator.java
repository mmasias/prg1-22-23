package classes;

import javax.swing.JOptionPane;

import classes.areaCalculators.*;

public class Calculator extends JOptionPane {
    public Calculator() {
        int operationSelector = Integer.parseInt(JOptionPane.showInputDialog(
                "Select the figure for which you want to calculate the area: (1. Square) (2. Triangle) (3. Circle)",
                "Input Number"));

        if (operationSelector == 1) {
            new squareCalculator();

        } else if (operationSelector == 2) {
            new triangleCalculator();

        } else if (operationSelector == 3) {
            new circleCalculator();
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

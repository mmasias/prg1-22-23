package classes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import classes.areaCalculators.*;

public class Calculator extends JOptionPane {
    public Calculator() {

        ImageIcon logo = new ImageIcon("https://github.com/Hexcss/Programacion-1/blob/main/retos/entregas/javierCader/areaCalculator/areaCalculatorAdvanced/src/assets/logo.png");

        String[] operations = {"Square", "Triangle", "Circle"};

        int operationSelector = (JOptionPane.showOptionDialog(null, "Select the figure for which you want to calculate the area", "Area Calculator", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, logo, operations, 0));

        if (operationSelector == 0) {
            new squareCalculator();
        } else if (operationSelector == 1) {
            new triangleCalculator();
        } else if (operationSelector == 2) {
            new circleCalculator();
        } else if (operationSelector == -1) {
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

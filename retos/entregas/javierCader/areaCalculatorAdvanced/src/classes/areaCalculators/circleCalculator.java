package classes.areaCalculators;

import javax.swing.JOptionPane;

public class circleCalculator extends JOptionPane {
    public circleCalculator() {
        double radiusLength = Double.parseDouble(
                JOptionPane.showInputDialog("Input the lenght of the circle radius:", "Lenght of Side"));

        double circleArea = Math.PI * Math.pow(radiusLength, 2);

        JOptionPane.showMessageDialog(null,
                String.format("The Area of the circle of radius %f is %f", radiusLength, circleArea),
                "Circle Area Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}

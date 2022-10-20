package classes.areaCalculators;

import javax.swing.JOptionPane;

public class triangleCalculator extends JOptionPane {
    public triangleCalculator() {

        double baseLength = Double
                .parseDouble(JOptionPane.showInputDialog("Input the lenght of the triangle base:", "Lenght of Side"));

        double heightLength = Double
                .parseDouble(JOptionPane.showInputDialog("Input the lenght of the triangle hieght:", "Lenght of Side"));

        double triangleArea = baseLength * heightLength;

        JOptionPane.showMessageDialog(null, String.format("The area of the triangle of base %f and height %f is %f",
                baseLength, heightLength, triangleArea), "Triangle Area Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}

package classes.areaCalculators;

import javax.swing.JOptionPane;

public class squareCalculator extends JOptionPane {
    public squareCalculator() {
        double sideLength = Double
                .parseDouble(JOptionPane.showInputDialog("Input the lenght of the rectangle side:", "Lenght of Side"));

        double squareArea = Math.pow(sideLength, 2);

        JOptionPane.showMessageDialog(null,
                String.format("The area of the square of side of lenght %f is %f", sideLength, squareArea),
                "Square Area Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}

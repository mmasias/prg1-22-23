import javax.swing.JOptionPane;

import classes.Calculator;

public class App {
    public static void main(String[] args) throws Exception {

        boolean run = true;

        while (run) {

            new Calculator();

            int continueRunning = JOptionPane.showConfirmDialog(null, "Do you want to do another operation?",
                    "Continue Running", JOptionPane.YES_NO_OPTION);

            if (continueRunning == 1 || continueRunning == -1) {
                run = false;
            }
        }
    }
}

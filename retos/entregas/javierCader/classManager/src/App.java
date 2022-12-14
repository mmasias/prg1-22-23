import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] classes = {"Libre", "Libre", "Libre", "Libre", "Libre", "Libre"};
        String[] options = {"Display Class Status", "Reserve Class", "Free Class", "Exit"};

        runSystem(classes, options);
    }

    public static void runSystem(String[] classes, String[] options) {

        boolean runSystem = true;

        while (runSystem) {
            printBorders();
            menuHandler(classes, options, runSystem);
            printBorders();
        }
    }

    public static void menuHandler(String[] classes, String[] options, boolean runSystem) {
        int optionInput;

        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1) + options[i]);
        }

        System.out.println("Input the option you want to choose: ");
        optionInput = userInput();

        if (optionInput == 1) {
            displayClassStatus(classes);
        } else if (optionInput == 2) {
            reserveClass(classes);
        } else if (optionInput == 3) {
            freeClass(classes);
        } else if (optionInput == 4) {
            runSystem = exitSystem();
        } else {
            System.out.println("Please input a valid option");
        }


    }

    public static void printBorders() {
        System.out.println("----------------------------------------");
    }

    public static void displayClassStatus(String[] classes) {
        for (int i = 0; i < classes.length; i++) {
            System.out.println("Class " + (i+1) + ": " + classes[i]);
        }
    }

    public static void reserveClass(String[] classes) {
        int classToReserve;

        classToReserve = userInput();

        classes[classToReserve - 1] = "Reservado";

    }

    public static void freeClass(String[] classes) {
        int classToFree;

        classToFree = userInput();

        classes[classToFree - 1] = "Libre";
    }

    public static boolean exitSystem() {
        return false;
    }

    public static int userInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

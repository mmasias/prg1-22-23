import java.util.Scanner;

import classes.*;

// i = x; j = y;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Pattern Creator Challenge");
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.println("Input the number of the challenge you want to run: (0 to exit)");
            int number = scanner.nextInt();

            switch(number){
                case 0:
                    run = false;
                    break;
                case 1:
                    new Challenge1();
                    break;
                case 2:
                    new Challenge2();
                    break;
                case 3:
                    new Challenge3();
                    break;
                case 4:
                    new Challenge4();
                    break;
                case 5:
                    new Challenge5();
                    break;
                case 6:
                    new Challenge6();
                    break;
                case 7:
                    new Challenge7();
                    break;
                case 8:
                    new Challenge8();
                    break;
                case 9:
                    new Challenge9();
                    break;
                case 10:
                    new Challenge10();
                    break;
                case 11:
                    new Challenge11();
                    break;
                case 12:
                    new Challenge12();
                    break;
                case 13:
                    new Challenge13();
                    break;
                case 14:
                    new Challenge14();
                    break;
                case 15:
                    new Challenge15();
                    break;
                case 16:
                    new Challenge16();
                    break;
                case 17:
                    new Challenge17();
                    break;
                case 18:
                    new Challenge18();
                    break;
                case 19:
                    new Challenge19();
                    break;
                case 20:
                    new Challenge20();
                    break;
                case 21:
                    new Challenge21();
                    break;
                default:
                    System.out.println("Sorry, that is not a valid input");
            }
        }

        scanner.close();
    }
}

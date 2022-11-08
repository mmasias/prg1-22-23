import java.util.Scanner;

import classes.*;

public class ForIfChallenge2 {
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
                    new ForIf1();
                    break;
                case 2:
                    new ForIf2();
                    break;
                case 3:
                    new ForIf3();
                    break;
                case 4:
                    new ForIf4();
                    break;
                case 5:
                    new ForIf5();
                    break;
                case 6:
                    new ForIf6();
                    break;
                case 7:
                    new ForIf7();
                    break;
                case 8:
                    new ForIf8();
                    break;
                case 9:
                    new ForIf9();
                    break;
                case 10:
                    new ForIf10();
                    break;
                case 11:
                    new ForIf11();
                    break;
                case 12:
                    new ForIf12();
                    break;
                case 13:
                    new ForIf13();
                    break;
                case 14:
                    new ForIf14();
                    break;
                case 15:
                    new ForIf15();
                    break;
                case 16:
                    new ForIf16();
                    break;
                case 17:
                    new ForIf17();
                    break;
                case 18:
                    new ForIf18();
                    break;
                case 19:
                    new ForIf19();
                    break;
                case 20:
                    new ForIf20();
                    break;
                case 21:
                    new ForIf21();
                    break;
                default:
                    System.out.println("Sorry, that is not a valid input");
            }
        }

        scanner.close();
    }
}
import java.util.Scanner;

import classes.Card1;
import classes.Card2;
import classes.Card3;
import classes.Card4;
import classes.Card5;
import classes.Card6;
import classes.Card7;

public class App {
    public static void main(String[] args) throws Exception {

        double numberGuessed = 0;
        int isInCard;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number from 1 to 99:");
        scanner.nextLine();

        new Card1();
        System.out.println("Is your number in card 1? (1 = Yes, 0 = No)");
        isInCard = scanner.nextInt();
        if (isInCard == 1) {
            numberGuessed = numberGuessed + Math.pow(2, 0);
            isInCard = 0;
        } else if (isInCard < 0 || isInCard > 1) {
            System.out.println("Invalid Option");
            scanner.close();
            return;
        }

        new Card2();
        System.out.println("Is your number in card 2? (1 = Yes, 0 = No)");
        isInCard = scanner.nextInt();
        if (isInCard == 1) {
            numberGuessed = numberGuessed + Math.pow(2, 1);
            isInCard = 0;
        } else if (isInCard < 0 || isInCard > 1) {
            System.out.println("Invalid Option");
            scanner.close();
            return;
        }

        new Card3();
        System.out.println("Is your number in card 3? (1 = Yes, 0 = No)");
        isInCard = scanner.nextInt();
        if (isInCard == 1) {
            numberGuessed = numberGuessed + Math.pow(2, 2);
            isInCard = 0;
        } else if (isInCard < 0 || isInCard > 1) {
            System.out.println("Invalid Option");
            scanner.close();
            return;
        }

        new Card4();
        System.out.println("Is your number in card 4? (1 = Yes, 0 = No)");
        isInCard = scanner.nextInt();
        if (isInCard == 1) {
            numberGuessed = numberGuessed + Math.pow(2, 3);
            isInCard = 0;
        } else if (isInCard < 0 || isInCard > 1) {
            System.out.println("Invalid Option");
            scanner.close();
            return;
        }

        new Card5();
        System.out.println("Is your number in card 5? (1 = Yes, 0 = No)");
        isInCard = scanner.nextInt();
        if (isInCard == 1) {
            numberGuessed = numberGuessed + Math.pow(2, 4);
            isInCard = 0;
        } else if (isInCard < 0 || isInCard > 1) {
            System.out.println("Invalid Option");
            scanner.close();
            return;
        }

        new Card6();
        System.out.println("Is your number in card 6? (1 = Yes, 0 = No)");
        isInCard = scanner.nextInt();
        if (isInCard == 1) {
            numberGuessed = numberGuessed + Math.pow(2, 5);
            isInCard = 0;
        } else if (isInCard < 0 || isInCard > 1) {
            System.out.println("Invalid Option");
            scanner.close();
            return;
        }

        new Card7();
        System.out.println("Is your number in card 7? (1 = Yes, 0 = No)");
        isInCard = scanner.nextInt();
        if (isInCard == 1) {
            numberGuessed = numberGuessed + Math.pow(2, 6);
            isInCard = 0;
        } else if (isInCard < 0 || isInCard > 1) {
            System.out.println("Invalid Option");
            scanner.close();
            return;
        }

        System.out.println("The number you were thinking about is: " + numberGuessed);

        scanner.close();
    }
}

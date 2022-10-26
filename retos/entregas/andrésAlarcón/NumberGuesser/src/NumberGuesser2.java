import java.util.Scanner;

import classes.Card1;
import classes.Card2;
import classes.Card3;
import classes.Card4;
import classes.Card5;
import classes.Card6;
import classes.Card7;

public class NumberGuesser2{
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int choiceCardOne, choiceCardTwo, choiceCardThree, choiceCardFour, choiceCardFive, choiceCardSix, choiceCardSeven;
        int numberOfChoiceOne, numberOfChoiceTwo, numberOfChoiceThree, numberOfChoiceFour, numberOfChoiceFive, numberOfChoiceSix, numberOfChoiceSeven, chosenNumber;

        
        System.out.println("Choose a number from 1 to 99; select the card your number appers with 1 for yes and 0 for false");

        new Card1();

        System.out.println("Is your number in the first card? (1=Yes 0=No)");
        choiceCardOne = sc.nextInt();
        
        new Card2();

        System.out.println("Is your number in the second card? (1=Yes 0=No)");
        choiceCardTwo = sc.nextInt();

        new Card3();

        System.out.println("Is your number in the third card? (1=Yes 0=No)");
        choiceCardThree = sc.nextInt();

        new Card4();

        System.out.println("Is your number in the fourth card? (1=Yes 0=No)");
        choiceCardFour = sc.nextInt(); 

        new Card5();

        System.out.println("Is your number in the fifth card? (1=Yes 0=No)");
        choiceCardFive = sc.nextInt();

        new Card6();

        System.out.println("Is your number in the sixth card? (1=Yes 0=No)");
        choiceCardSix = sc.nextInt();

        new Card7();

        System.out.println("Is your number in the seventh card? (1=Yes 0=No)");
        choiceCardSeven = sc.nextInt();

        if (choiceCardOne == 1) {
            numberOfChoiceOne = (int) Math.pow(2, 0);
        } else {
            numberOfChoiceOne = 0;
        } 

        if (choiceCardTwo == 1) {
            numberOfChoiceTwo = (int) Math.pow(2, 1);
        } else {
            numberOfChoiceTwo = 0;
        }

        if (choiceCardThree == 1) {
            numberOfChoiceThree = (int) Math.pow(2, 2);
        } else {
            numberOfChoiceThree = 0;
        } 

        if (choiceCardFour == 1) {
            numberOfChoiceFour = (int) Math.pow(2, 3);
        } else {
            numberOfChoiceFour = 0;
        }

        if (choiceCardFive == 1) {
            numberOfChoiceFive = (int) Math.pow(2, 4);
        } else {
            numberOfChoiceFive = 0;
        }

        if (choiceCardSix == 1) {
            numberOfChoiceSix = (int) Math.pow(2, 5);
        } else {
            numberOfChoiceSix = 0;
        }
        
        if (choiceCardSeven == 1) {
            numberOfChoiceSeven = (int) Math.pow(2, 6);
        } else {
            numberOfChoiceSeven = 0;
        }

        chosenNumber =  numberOfChoiceOne + numberOfChoiceTwo + numberOfChoiceThree + numberOfChoiceFour + numberOfChoiceFive + numberOfChoiceSix + numberOfChoiceSeven;

        sc.close();

        System.out.println("Your number is " + chosenNumber);
    }

    
}

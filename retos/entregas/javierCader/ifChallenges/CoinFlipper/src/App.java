import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Coin Flipper!");

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Flip coin? 1 for yes or 0 for no");

        int flip = scanner.nextInt();

        if (flip == 1) {

            int coinSide = rand.nextInt(2);

            if (coinSide == 1) {
                System.out.println("Heads!");
            } else if (coinSide == 0) {
                System.out.println("Tails!");
            } else {
                System.out.println("Something unexpected happened!");
            }
        } else if (flip == 0) {
            System.out.println("Come play soon!");
        } else {
            System.out.println("That's not a valid option!");
        }

        scanner.close();
    }
}

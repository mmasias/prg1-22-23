import java.util.Scanner;

public class RestrictedDivison {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    double numberOne, numberTwo, division;

    System.out.println("Enter the numerator: ");
    numberOne = sc.nextInt();
    System.out.println("Enter the denominator: ");
    numberTwo = sc.nextInt();

    division = (numberOne/numberTwo);
    
    if (numberTwo == 0) {
        System.out.println("You can't divide by 0, the division is undefined.");
        } else {
        System.out.println("The result "+ division);
        }

    sc.close();

    }
}

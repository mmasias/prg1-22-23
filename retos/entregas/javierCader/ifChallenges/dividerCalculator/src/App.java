import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Divider Calculator");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the Dividend");
        double dividend = scanner.nextDouble();
        System.out.println("Input the Divisor");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double result = dividend / divisor;
            System.out.println("The result is " + result);
        } else {
            System.out.println("Math Error");
        }

        scanner.close();
    }
}

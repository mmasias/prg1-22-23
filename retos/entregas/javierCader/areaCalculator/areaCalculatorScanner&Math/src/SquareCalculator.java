import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        System.out.println("Calculator of the Area of a Square");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the square side lenght");

        double sideLength = scanner.nextFloat();

        double area = Math.pow(sideLength, 2);

        System.out.println("The area of the square of side length " + sideLength + " is " + area);

        scanner.close();
    }
}

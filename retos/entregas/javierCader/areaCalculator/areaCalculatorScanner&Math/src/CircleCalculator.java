import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        System.out.println("Calculator of the Area of a Circle");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the radius side lenght");

        double radiusLength = scanner.nextFloat();

        double pi = 3.141516;

        double area = pi * Math.pow(radiusLength, 2);

        System.out.println("The area of the circle of radius " + radiusLength + " is " + area);

        scanner.close();
    }
}

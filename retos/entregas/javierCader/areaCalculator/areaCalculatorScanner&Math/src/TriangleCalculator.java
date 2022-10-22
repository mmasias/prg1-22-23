import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator of the Area of a Triangle");

        System.out.println("Input the Base Length");

        float baseLength = scanner.nextFloat();

        System.out.println("Input the length of the height");

        float heightLength = scanner.nextFloat();

        float area = (baseLength * heightLength) / 2;

        System.out.println("The area of the triangle is" + area);

        scanner.close();
    }
}

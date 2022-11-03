import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        double data_1, data_2, average;

        System.out.println("Enter the first value");
        data_1 = lector.nextDouble();
        System.out.println("Enter the second value");
        data_2 = lector.nextDouble();

        average = (data_1 + data_2)/2;

        System.out.println("The average: "+average);

        lector.close();
    }
}
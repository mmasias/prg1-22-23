import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double side, area;

        System.out.println("Enter the side");
        side = sc.nextDouble();

        area = side * side;

        System.out.println("Area of Square is: " + area); 

        sc.close();

    }
}
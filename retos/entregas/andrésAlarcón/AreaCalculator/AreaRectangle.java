import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base, heigth, area;

        System.out.println("Enter the base");
        base = sc.nextDouble();
        System.out.println("Enter the heigth");
        heigth = sc.nextDouble();

        area = base * heigth;

        System.out.println("Area of Rectangle is: " + area); 

        sc.close();
    }
}
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base, heigth, area;

        System.out.println("Enter the base");
        base = sc.nextDouble();
        System.out.println("Enter the heigth");
        heigth = sc.nextDouble();

        area = (base * heigth)/2;

        System.out.println("Area of Triangle is: " + area); 

        sc.close();

    }
}
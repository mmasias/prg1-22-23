import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double ratio, area;

        System.out.println("Enter the radius");
        ratio = sc.nextDouble();
        area = 3.141592 * ratio;

        System.out.println("Area of Circle is: " + area); 

        sc.close();
    
    }
}
import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double a, b, c, discriminant, x1, x2;

        System.out.println("Quadratic Equation = ax^2+ bx+ c");

        System.out.println("Enter the value of a");
        a = sc.nextDouble();

        System.out.println("Enter the value of b");
        b = sc.nextDouble();

        System.out.println("Enter the value of c");
        c = sc.nextDouble();

        discriminant= b * b - 4.0 * a * c;

        if (discriminant > 0.0) {
            x1 = (-b + Math.pow(discriminant, 0.5))/(2.0 * a);
            x2 = (-b - Math.pow(discriminant, 0.5))/(2.0 * a);
            System.out.println("The roots are " + x1 + " and " + x2);

        } else if (discriminant == 0){
            x1 = -b/(2*a);
            System.out.println("The root is " + x1);

        } else {
            System.out.println("Roots are not real.");

        }
        
        sc.close();

    }
}

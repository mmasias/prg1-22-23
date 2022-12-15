import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Polynomic Calculator of type: ax**2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the value of 'a':");
        double a = scanner.nextInt();
        System.out.println("Input the value of 'b':");
        int b = scanner.nextInt();
        System.out.println("Input the value of 'c':");
        int c = scanner.nextInt();

        double d = Math.pow(b, 2) - 4 * a * c; // Comentario

        if (a != 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (d < 0) {
                System.out.println("Roots are not real");
            } else {
                System.out.println("The result for x1 is: " + x1);
                System.out.println("The result for x2 is: " + x2);
            }
        } else {
            System.out.println("Math error");
        }

        scanner.close();
    }
}

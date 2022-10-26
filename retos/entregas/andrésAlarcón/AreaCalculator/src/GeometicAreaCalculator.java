import java.util.Scanner;

public class GeometicAreaCalculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Select the figure you want to know the area: 1. Square 2.Rectangle 3. Triangle 4. Circle");

        int option;
        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter the base");
                double baseSquare = sc.nextDouble();
                double square = baseSquare * baseSquare;
                System.out.println("The area is " + square);
                return;

            case 2:
                System.out.println("Enter the base");
                double baseRectangle = sc.nextDouble();
                System.out.println("Enter the heigth");
                double heigthRectangle = sc.nextDouble();
                double rectangle = baseRectangle * heigthRectangle;
                System.out.println("The area is " + rectangle);
                return;

            case 3:
                System.out.println("Enter the base");              
                double baseTriangle = sc.nextDouble();
                System.out.println("Enter the heigth");
                double heigthTriangle = sc.nextDouble();
                double triangle = (baseTriangle * heigthTriangle)/2;
                System.out.println("The area is " + triangle);
                return;

            case 4:
                System.out.println("Enter the radius");
                double radius = sc.nextDouble();
                double Circle = Math.PI * Math.pow(radius, 2);
                System.out.println("The area is " + Circle);
                return;
                
        };
        
        sc.close();
    }
}

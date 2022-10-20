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
                double basesquare = sc.nextDouble();
                double Square = basesquare * basesquare;
                System.out.println("The area is " + Square);
                break;

            case 2:
                System.out.println("Enter the base");
                double baserectangle = sc.nextDouble();
                System.out.println("Enter the heigth");
                double heigthrectangle = sc.nextDouble();
                double Rectangle = baserectangle * heigthrectangle;
                System.out.println("The area is " + Rectangle);
                break;

            case 3:
                System.out.println("Enter the base");              
                double basetriangle = sc.nextDouble();
                System.out.println("Enter the heigth");
                double heigthtriangle = sc.nextDouble();
                double Triangle = (basetriangle * heigthtriangle)/2;
                System.out.println("The area is " + Triangle);
                break;

            case 4:
                System.out.println("Enter the radius");
                double radius = sc.nextDouble();
                double Circle = Math.PI * Math.pow(radius, 2);
                System.out.println("The area is " + Circle);
                break;
                
        };
        
        sc.close();
    }
}

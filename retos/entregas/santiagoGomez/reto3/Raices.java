import java.util.Scanner;

public class Raices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //solicitar los numeros al usuario
        System.out.println("+----------------------------------------------------+");
        System.out.println("| Dime los numeros para la ecuacion de segundo grado |");
        System.out.println("| Ecuacion: ax^2 + bx + c = 0                        |");
        System.out.println("| X1 = raiz positiva  |   X2 = raiz negativa         |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("| Dime que numero es a:                              |");
        double a = sc.nextDouble();
        System.out.println("+----------------------------------------------------+");
        System.out.println("| Dime que numero es b:                              |");
        double b = sc.nextDouble();
        System.out.println("+----------------------------------------------------+");
        System.out.println("| Dime que numero es c:                              |");
        double c = sc.nextDouble();
        System.out.println("+----------------------------------------------------+");

        //Se empieza a generar la ecuacion X1
        if (a == 0){
            System.out.println("No se puede realizar la operacion X1, no se puede dividir por 0");
        } else {
            double resultado = (-b + (Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/(2*a);
            System.out.println("La X1 es: " + resultado);
        }

        //Se empieza a generar la ecuacion X2
        if (a == 0){
            System.out.println("No se puede realizar la operacion X2, no se puede dividir por 0");
        } else {
            double resultado = (-b - (Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/(2*a);
            System.out.println("La X2 es: " + resultado);
        }
        
    }
}

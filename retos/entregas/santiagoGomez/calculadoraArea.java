package intervencionUsuario;
import java.util.Scanner;

public class calculadoraArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // areas distintas
        System.out.println("+---------------------------+");
        System.out.println("¿Que area quieres sacar?");
        System.out.println("-----------------------------");
        System.out.println("1| Area de cuadrado");
        System.out.println("2| Area de rectangulo");
        System.out.println("3| Area de circulo");
        System.out.println("+---------------------------+");
        int operacion = sc.nextInt();
        double PI = 3.141592;

        //operaciones 
        if (operacion == 1){
            System.out.println("La ecuacion es: (Lado * Lado)");

            System.out.println("Dime el lado del cuadrado para sacar el area");
            double num1 = sc.nextDouble();
            double areaCuadrado = num1*num1;
            System.out.println("El resultado es: "+areaCuadrado);
        } else if (operacion == 2){
            System.out.println("La ecuacion es: (Base * Altura)");

            System.out.println("Dime el largo y base del rectangulo para sacar el area");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double areaRectangulo = num1*num2;
            System.out.println("El resultado es: "+areaRectangulo);
        } else if (operacion == 3){
            System.out.println("La ecuacion es: (Pi * radio ^2)");

            System.out.println("Dime el radio del circulo para sacar el área");
            System.out.println("Tomar en cuenta que PI = 3.141592");
            double num1 = sc.nextDouble();
            double areaCirculo = PI * (num1*num1);
            System.out.println("El resultado es: "+areaCirculo);
        } else {
            System.out.println("No te he entendido, recuerda poner la operacion como sale exactamente");
        }
    }
}

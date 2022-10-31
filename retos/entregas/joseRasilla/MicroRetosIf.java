import java.util.Scanner;

public class MicroRetosIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        /* Ejercicio 1: Lanzamiento de moneda */
        System.out.println("Lanzamiento de moneda:");
        double random = Math.random();
        if ((1 - random) > random) {
            // El numero es mas cercano a 0 que a 1
            System.out.println("Ha salido cara");
        } else {
            // El numero es mas cercano a 1 que a 0
            System.out.println("Ha salido cruz");
        }

        /* Ejercicio 2: Calculadora division */
        double dividendo, divisor, division;

        System.out.println("Introduzca el dividendo");
        dividendo = entrada.nextDouble();

        System.out.println("Introduzca el divisor");
        divisor = entrada.nextDouble();

        if (divisor <= 0) {
            System.out.println("No existe resultado a su division");
        } else {
            division = dividendo / divisor;
            System.out.println("El resultado es: " + division);
        }

        /* Ejercicio 3: Ecuaciones de segundo grado */
        double a, b, c, resultadoPos, resultadoNeg;

        System.out.println("Introduzca el valor para a");
        a = entrada.nextDouble();

        System.out.println("Introduzca el valor para b");
        b = entrada.nextDouble();

        System.out.println("Introduzca el valor para c");
        c = entrada.nextDouble();

        
        double determinante = Math.pow(b, 2) - (4 * a * c);
        System.out.println("Determinante "+ determinante);

        if(determinante < 0){
            System.out.println("La ecuacion no tiene resultado");    
        }
        else if (determinante == 0){
            resultadoPos = (-b / (2 * a));
            System.out.println("El resultado de su ecuacion es: x = " + resultadoPos);
        }
        else{
            resultadoPos = ((-b + Math.sqrt(determinante)) / (2 * a));
            System.out.println("El primer resultado de su ecuacion es: x = " + resultadoPos);

            resultadoNeg = ((-b - Math.sqrt(determinante)) / (2 * a));
            System.out.println("El segundo resultado de su ecuacion es: x = " + resultadoNeg);
        }

        entrada.close();
    }
}

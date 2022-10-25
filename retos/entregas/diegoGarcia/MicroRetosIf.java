import java.util.Scanner;

public class MicroRetosIf {
    public static void main (String [] args){

        System.out.println("\n");
        System.out.println("EJERCICIO 1: Escriba un programa que simule el lanzamiento de una moneda y nos diga al ejecutarse si ha salido cara o cruz.");
        System.out.println();

        int ladoAleatorio;
        String moneda;

        ladoAleatorio = (int)(Math.random()*2);

        if (ladoAleatorio == 0){
            moneda = "Cara";
        }else{
            moneda = "Cruz";
        }
        
        System.out.println("Ha salido "+ moneda);
        System.out.println("\n");

        System.out.println("EJERCICIO 2: Escriba un programa que pregunte dos números al usuario y realice la división de dos números, siempre y cuando el usuario no pida dividir por cero.");
        System.out.println();

        Scanner s = new Scanner(System.in);

        double dividendo, divisor, resultadoDivision;

        System.out.print("Escriba un numero que funcione como dividendo: ");
        dividendo = s.nextDouble();
        System.out.println();
        System.out.print("Escriba otro numero que funcione como divisor: ");
        divisor = s.nextDouble();
        System.out.println();
        

        if (divisor == 0){
            System.out.println("No se puede dividir un numero entre 0");
        }else{
            resultadoDivision = dividendo/divisor;
            System.out.println("El resultado de dividir "+ dividendo +" + "+ divisor +" es igual a "+resultadoDivision);
        }

        System.out.println("\n");
        System.out.println("EJERCICIO 3: Escriba un programa que pregunte al usuario los coeficientes y calcule las raíces de una ecuación de segundo grado ax^2 + bx + c = 0.");
        System.out.println();
        
        double coeficienteCuadratico, coeficienteLineal, terminoIndependiente, ecuacionCuadraticaPositivos, ecuacionCuadraticaNegativos, raiz;

        System.out.print("Escriba el coeficiente cuadratico de la operacion de segundo grado: ");
        coeficienteCuadratico = s.nextDouble();
        System.out.println();
        System.out.print("Escriba el coeficiente lineal de la operacion de segundo grado: ");
        coeficienteLineal = s.nextDouble();
        System.out.println();
        System.out.print("Escriba el termino independiente de la operacion de segundo grado: ");
        terminoIndependiente = s.nextDouble();
        System.out.println();

        raiz = Math.sqrt(Math.pow(coeficienteLineal, 2)-4 * coeficienteCuadratico * terminoIndependiente);

        ecuacionCuadraticaPositivos = (-coeficienteLineal + raiz)/(2*coeficienteCuadratico);

        ecuacionCuadraticaNegativos = (-coeficienteLineal - raiz)/(2*coeficienteCuadratico);

        System.out.println("De la ecuacion "+ coeficienteCuadratico +"x^2 + "+ coeficienteLineal +"x + "+ terminoIndependiente +" concluimos que su raiz positiva es igual a "+ ecuacionCuadraticaPositivos +" y que su raiz negativa es igual a "+ ecuacionCuadraticaNegativos);
        s.close();

    }
}

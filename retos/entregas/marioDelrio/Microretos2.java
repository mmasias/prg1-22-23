import java.util.Scanner;

public class Microretos2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ejercicio 1");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        //consiste en simular el lanzamiento de una moneda
        System.out.println("\n");

        double moneda = (double) (Math.random()*2);

        System.out.println(" ");
        if (moneda==0) {
            System.out.println("ha salido cara");
        } else {
            System.out.println("ha salido cruz");
        }

        System.out.println("\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ejercicio 2");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        //consiste dividir dos numeros
        System.out.println("\n");

        double dividendo, divisor, resultado;

        System.out.println("Dime el dividendo");
        dividendo= entrada.nextDouble();

        System.out.println("Dime el divisor");
        divisor= entrada.nextDouble();

        if (divisor == 0){

            System.out.println("no se puede dividir entre 0, dime otro numero");
            divisor= entrada.nextInt();
        }

        resultado = dividendo/divisor;
        
        System.out.println("El resultado es " + resultado);

        System.out.println("\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ejercicio 3");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        //consiste en realizar una acuacion del 2 grado
        System.out.println("\n");

        double a, b, c, raiz, interiorRaiz, resultadoPositivo, resultadoNegativo;

        System.out.println("Dime el primer numero el cual estara con la incognita elevado a 2");
        a = entrada.nextInt();

        System.out.println("Dime el primer numero el cual estara con la incognita elevado a 1");
        b = entrada.nextInt();

        System.out.println("Dime el primer numero el cual no tiene incognita");
        c = entrada.nextInt();

        if (a == 0){
            System.out.println("Ningun numero puede ser 0 si quieres hacer esta ecuacion dame otro valor para a");
            a = entrada.nextInt(); 
        }
        if (b == 0){
            System.out.println("Ningun numero puede ser 0 si quieres hacer esta ecuacion dame otro valor para b");
            b = entrada.nextInt(); 
        }
        if (c == 0){
            System.out.println("Ningun numero puede ser 0 si quieres hacer esta ecuacion dame otro valor para c");
            c = entrada.nextInt(); 
        }

        interiorRaiz= (Math.pow(b, 2)-4 * a * c);
        raiz = Math.sqrt(interiorRaiz);
        if (interiorRaiz <= 0){
            System.out.println("la raiz da negativo y no tiene resultado");
        } else {
            resultadoPositivo = (-b + raiz)/(2*a);

            resultadoNegativo = (-b - raiz )/(2*a);

            System.out.println("la ecuacion tiene 2 resultados un positivo: "+ resultadoPositivo +" Y un negativo: "+ resultadoNegativo);

        }
    }
}

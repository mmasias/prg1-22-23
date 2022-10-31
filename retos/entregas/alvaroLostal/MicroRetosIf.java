import java.util.Scanner;

public class MicroRetosIf {
    public static void main(String[] args) {
        //Ejercicio 1
        int aleatorio = (int) (Math.random()*2);
        if (aleatorio == 0) {
            System.out.println("Ha salido cara");
        } else {
            System.out.println("Ha salido cruz");
        }

        //Ejercicio 2
        Scanner entrada = new Scanner(System.in);

        double num1, num2, resultado;
        System.out.println("Ingresa un numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Ingresa otro numero: ");
        num2 = entrada.nextDouble();
        if (num2 == 0) {
            System.out.println("No se puede dividir un numero entre 0");
        } else {
            resultado = (num1/num2);
            System.out.println("El resultado de dividir " + num1 + " entre " + num2 + " da " + resultado);
        }

        //Ejercicio 3
        double a, b, c, raiz, positivos, negativos, comprobacion;
        System.out.println("Dime el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Dime el valor de b: ");
        b = entrada.nextDouble();
        System.out.println("Dime el valor de c: ");
        c = entrada.nextDouble();


        comprobacion = ((b*b)-4*a*c);
        raiz = Math.sqrt(Math.pow(b, 2)-4 * a * c);
        if(comprobacion <= 0){
            System.out.println("La raiz no puede ser negativa");
        }else{
            positivos = (-b + raiz)/(2*a);
            negativos = (-b - raiz)/(2*a);
            System.out.println("La ecuación: "+ a +"x^2 + "+ b +"x + "+ c +" tiene como resultado (+) "+ positivos +" y (-) "+ negativos);
        }

        

        entrada.close();

    }
}

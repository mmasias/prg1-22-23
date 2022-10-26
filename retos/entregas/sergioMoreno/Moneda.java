import java.util.Scanner;

public class Moneda {
    public static void main(String[]args){

        System.out.println("");
        System.out.println("Simular el lanzamiento de una moneda y decir si ha salido cara o cruz.");
        System.out.println("");

        int lado;
        String moneda;

        lado = (int)(Math.random()*2);

        if (lado == 0){
            moneda = "Cara";
        }else{
            moneda = "Cruz";
        }
        
        System.out.println("Ha salido "+ moneda);
        System.out.println("");

        System.out.println("Preguntar dos números al usuario y realice la división de dos números, siempre y cuando el usuario no pida dividir por cero.");
        System.out.println("");

        Scanner x = new Scanner(System.in);

        double dividir, divisor, resultado;

        System.out.print("Escribe el numero que quieres dividir: ");
        dividir = x.nextDouble();
        System.out.println("");

        System.out.print("Escribe entre que numero quieres dividirlo: ");
        divisor = x.nextDouble();
        System.out.println("");
        

        if (divisor == 0){
            System.out.println("No se puede dividir un numero entre 0");
        }else{
            resultado = dividir/divisor;
            System.out.println("El resultado de dividir "+ dividir +" + "+ divisor +" es igual a "+resultado);
        }

        System.out.println("");
        System.out.println("Preguntar al usuario los coeficientes y calcule las raíces de una ecuación de segundo grado ax^2 + bx + c = 0.");
        System.out.println("");
        
        double cCuadratico, cLineal, terminoIndependiente, ecuacionCPositivos, ecuacionCNegativos, raiz;

        System.out.print("Escriba el coeficiente cuadratico de la operacion de segundo grado: ");
        cCuadratico = x.nextDouble();

        System.out.println("");
        System.out.print("Escriba el coeficiente lineal de la operacion de segundo grado: ");
        cLineal = x.nextDouble();

        System.out.println("");
        System.out.print("Escriba el coeficiente cuadratico de la operacion de segundo grado: ");
        terminoIndependiente = x.nextDouble();
        System.out.println("");

        raiz = Math.sqrt(Math.pow(cLineal, 2)-4 * cCuadratico * terminoIndependiente);

        ecuacionCPositivos = (-cLineal + raiz)/(2*cCuadratico);

        ecuacionCNegativos = (-cLineal - raiz)/(2*cCuadratico);

        System.out.println("De la ecuacion "+ cCuadratico +"x^2 + "+ cLineal +"x + "+ terminoIndependiente +" concluimos que su raiz positiva es igual a "+ ecuacionCPositivos +" y que su raiz negativa es igual a "+ ecuacionCNegativos);
        x.close();

}}

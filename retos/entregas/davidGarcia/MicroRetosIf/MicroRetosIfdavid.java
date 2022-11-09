import java.util.Scanner;
public class MicroRetosIfdavid {
    public static void main (String [] args){
        System.out.println("PROBLEMA 1.Escribir un programa que simule el lanzamiento de una moneda y nos diga al ejecutarse si ha salido cara o cruz.");
        int ladoMoneda;
        ladoMoneda = (int)(Math.random()*2);
        if (ladoMoneda == 0){
            System.out.println("Salió cruz");
        }else{
            System.out.println("Salió cara");
        }
        System.out.println("PROBLEMA 2. Escribir un programa que pregunte dos números al usuario y realice la división de dos números, siempre y cuando el usuario no pida dividir por cero.");
        Scanner entrada = new Scanner(System.in);
        double dividendo, divisor, soluciondivision;
        System.out.print("Número que funcione como dividendo: ");
        dividendo = entrada.nextDouble();
        System.out.println();
        System.out.print("Número que funcione como divisor: ");
        divisor = entrada.nextDouble();
        System.out.println();
        
        if (divisor == 0){
            System.out.println("Imposible dividir un numero entre 0");
        }else{
            soluciondivision = dividendo/divisor;
            System.out.println("El resultado de dividir "+ dividendo +" + "+ divisor +" es igual a "+soluciondivision);
        }
        System.out.println("\n");
        System.out.println("PROBLEMA 3. Escribir un programa que pregunte al usuario los coeficientes y calcule las raíces de una ecuación de segundo grado ax^2 + bx + c = 0.");
        System.out.println();
        
        double coeficienteCuadratico, coeficientelineal, terminoindependiente, ecuacioncuadraticapositivos, ecuacioncuadraticanegativos, raiz;
        System.out.print("Escribir coeficiente cuadratico de la operacion de segundo grado: ");
        coeficienteCuadratico = entrada.nextDouble();
        System.out.println();
        System.out.print("Escribir coeficiente lineal de la operacion de segundo grado: ");
        coeficientelineal = entrada.nextDouble();
        System.out.println();
        System.out.print("Escribir termino independiente de la operacion de segundo grado: ");
        terminoindependiente = entrada.nextDouble();
        System.out.println();

        raiz = Math.sqrt(Math.pow(coeficientelineal, 2)-4 * coeficienteCuadratico * terminoindependiente);
        ecuacioncuadraticapositivos = (-coeficientelineal + raiz)/(2*coeficienteCuadratico);
        ecuacioncuadraticanegativos = (-coeficientelineal - raiz)/(2*coeficienteCuadratico);
        System.out.println("En la ecuacion "+ coeficienteCuadratico +"x^2 + "+ coeficientelineal +"x + "+ terminoindependiente +" concluimos que su raiz positiva es igual a "+ ecuacioncuadraticapositivos +" y que su raiz negativa es igual a "+ ecuacioncuadraticanegativos);
        entrada.close();
    }
}

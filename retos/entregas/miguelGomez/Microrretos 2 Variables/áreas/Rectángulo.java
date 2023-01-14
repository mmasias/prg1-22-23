import java.util.Scanner;
public class Rectángulo {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime la longitud de la base del rectángulo en m: ");
        int Base = entrada.nextInt();

        System.out.println("Dime la longitud de la altura del rectángulo en m: ");
        int Altura = entrada.nextInt();

        System.out.println("El área del rectángulo es " + (Base * Altura) + " metros al cuadrado");

        entrada.close();
    }
}
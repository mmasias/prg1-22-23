import java.util.Scanner;
public class Cuadrado {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime la longitud del lado del cuadrado en m: ");
        int Lado = entrada.nextInt();

        System.out.println("El área del cuadrado es " + (Lado * Lado) + " metros al cuadrado");

        entrada.close();
    }
}
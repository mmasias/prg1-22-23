import java.util.Scanner;

public class Microrretodivision{
    public static void main (String Args[]){
        
    Scanner entrada = new Scanner(System.in);
    System.out.println("Dime un número a dividir");
    Double dividendo = entrada.nextDouble();
    System.out.println("Dime el número por el que lo dividirás");
    Double divisor = entrada.nextDouble();
    System.out.println(dividendo/divisor);

    entrada.close();
    }
        
}

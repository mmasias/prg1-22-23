import java.util.Scanner;
public class Promedio {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("dime un número: ");
        int Numero1 = entrada.nextInt();

        System.out.println("dime otro número: ");
        int Numero2 = entrada.nextInt();

        System.out.println("El promedio de los números es " + ((Numero1 + Numero2)/2));

        entrada.close();
    }
}
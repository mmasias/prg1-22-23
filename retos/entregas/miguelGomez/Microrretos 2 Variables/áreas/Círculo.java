import java.util.Scanner;
public class Círculo {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime la longitud del radio del círculo en m: ");
        int Radio = entrada.nextInt();

        double Pi = 3.141592;

        System.out.println("El área del círculo es " + ((Radio * Radio) * Pi) + " metros al cuadrado");

        entrada.close();
    }
}
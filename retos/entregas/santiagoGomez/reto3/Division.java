import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Solicitar números al usuario
        System.out.println("+---------------------+");
        System.out.println("| Division de numeros |");
        System.out.println("|---------------------|");
        System.out.println("|Dime los dos numeros |");
        System.out.println("+---------------------+");

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        // solicitar el orden de la division
        System.out.println("+---------------------------------+");
        System.out.println("| Como quieres hacer la division? |");
        System.out.println("+---------------------------------+");
        System.out.println("1| "+ num1 + "/" + num2);
        System.out.println("2| "+ num2 + "/" + num1);
        int division = sc.nextInt();

        //desarrollo de la division
        if (division == 1 && num2 != 0){
            System.out.println("La division es: "+ (num1/num2));
        } else if (division == 2 && num1 != 0){
            System.out.println("La division es: "+ (num2/num1));
        } else {
            System.out.println("No es posible realizar esta operación");
        }
    }
}

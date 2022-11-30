import java.util.Scanner;
public class AdivinarTarjetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeroAdivinado,respuesta;
        numeroAdivinado=0;
        System.out.println("Utilice 1 para SI, 0 para NO ");
        System.out.println("Piense un número del 1 al 99 \n");
        
        System.out.println("¿Tu nuemero esta en la papeleta 1?");
        respuesta=sc.nextInt();
        if (respuesta == 1 ) {
            System.out.println("Ok");
            numeroAdivinado = numeroAdivinado + 1;
        }
        System.out.println("¿Tu papeleta esta el 2?");
        respuesta=sc.nextInt();
        if (respuesta == 1 ) {
            System.out.println("Ok");
            numeroAdivinado = numeroAdivinado + 2;
        }
        System.out.println("¿Tu papeleta esta el 3?");
        respuesta=sc.nextInt();
        if (respuesta == 1 ) {
            System.out.println("Ok");
            numeroAdivinado = numeroAdivinado + 4;
        }
        System.out.println("¿Tu papeleta es el 4?");
        respuesta=sc.nextInt();
        if (respuesta == 1 ) {
            System.out.println("Ok");
            numeroAdivinado = numeroAdivinado + 8;
        }
        System.out.println("¿Tu papeleta es el 5?");
        respuesta=sc.nextInt();
        if (respuesta == 1 ) {
            System.out.println("Ok");
            numeroAdivinado = numeroAdivinado + 16;
        }
        System.out.println("¿Tu papeleta es el 6?");
        respuesta=sc.nextInt();
        if (respuesta == 1 ) {
            System.out.println("Ok");
            numeroAdivinado = numeroAdivinado + 32;
        }
        System.out.println("¿Tu papeleta es el 7?");
        respuesta=sc.nextInt();
        if (respuesta == 1 ) {
            System.out.println("Ok");
            numeroAdivinado = numeroAdivinado + 64;
        }
        System.out.println("Tu numero es "+numeroAdivinado);
        sc.close();
    }
}

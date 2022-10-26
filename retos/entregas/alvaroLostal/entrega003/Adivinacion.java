import java.util.Scanner;

public class Adivinacion {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int respuesta1, respuesta2, respuesta3, respuesta4, respuesta5, respuesta6, respuesta7, numeroPensado;
        numeroPensado = 0;

        System.out.println();
        System.out.println("Utilice 1 para SI, 0 para NO");
        System.out.println();
        System.out.println("Piense un número del 1 al 99");
        System.out.println();
        System.out.println("¿Está en la 1ra tarjeta?");
        respuesta1 = entrada.nextInt();
        System.out.println("¿Está en la 2a tarjeta?");
        respuesta2 = entrada.nextInt();
        System.out.println("¿Está en la 3a tarjeta?");
        respuesta3 = entrada.nextInt();
        System.out.println("¿Está en la 4a tarjeta?");
        respuesta4 = entrada.nextInt();
        System.out.println("¿Está en la 5a tarjeta?");
        respuesta5 = entrada.nextInt();
        System.out.println("¿Está en la 6a tarjeta?");
        respuesta6 = entrada.nextInt();
        System.out.println("¿Está en la 7ma tarjeta?");
        respuesta7 = entrada.nextInt();
        System.out.println();
        
        if (respuesta1 == 1){
            numeroPensado = numeroPensado +1;
        }if(respuesta2 == 1){
            numeroPensado = numeroPensado +2;
        }if(respuesta3 == 1){
            numeroPensado = numeroPensado +4;
        }if(respuesta4 == 1){
            numeroPensado = numeroPensado +8;
        }if(respuesta5 == 1){
            numeroPensado = numeroPensado +16;
        }if(respuesta6 == 1){
            numeroPensado = numeroPensado +32;
        }if(respuesta7 == 1){
            numeroPensado = numeroPensado +64;
        }

        System.out.println("El número pensado es " + numeroPensado);
        respuesta7 = entrada.nextInt();

        entrada.close();

    }
}

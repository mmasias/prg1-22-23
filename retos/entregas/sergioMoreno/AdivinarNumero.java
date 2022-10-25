import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {

    Scanner x = new Scanner(System.in);

    int respuesta;
    int numeroPensado;

    System.out.println("Piensa en un número del 1 al 99");
    
    numeroPensado=0;

    System.out.println("¿El número esta en la tarjeta 1?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("Entiendo...");
        numeroPensado = numeroPensado + 1;
    } 
    System.out.println("¿El número esta en la tarjeta 2?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("Entiendo...");
        numeroPensado = numeroPensado + 2;
    } 

    System.out.println("¿El número esta en la tarjeta 3?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("Entiendo...");
        numeroPensado = numeroPensado + 4;
    } 

    System.out.println("¿El número esta en la tarjeta 4?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("Entiendo...");
        numeroPensado = numeroPensado + 8;
    } 

    System.out.println("¿El número esta en la tarjeta 5?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("Entiendo...");
        numeroPensado = numeroPensado + 16;
    } 

    System.out.println("¿El número esta en la tarjeta 6?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("Entiendo...");
        numeroPensado = numeroPensado + 32;
    } 

    System.out.println("¿El número esta en la tarjeta 7?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("Entiendo...");
        numeroPensado = numeroPensado + 64;
    } 

    System.out.println("El número que habias pensado era el " + numeroPensado);

    }
    
}
import java.util.Scanner;

public class adivinacion {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Piensa un número del 1 al 100");
    int respuestadelusuario;
    int numeropensado;
    numeropensado=0;
    System.out.println("¿El número esta en la tarjeta 1?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    if (respuestadelusuario == 1 ) {
        System.out.println("De acuerdo");
        numeropensado = numeropensado + 1;
    } 
    System.out.println("¿El número esta en la tarjeta 2?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    if (respuestadelusuario == 1 ) {
        System.out.println("De acuerdo");
        numeropensado = numeropensado + 2;
    } 
    System.out.println("¿El número esta en la tarjeta 3?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    if (respuestadelusuario == 1 ) {
        System.out.println("De acuerdo");
        numeropensado = numeropensado + 4;
    } 
    System.out.println("¿El número esta en la tarjeta 4?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    if (respuestadelusuario == 1 ) {
        System.out.println("De acuerdo");
        numeropensado = numeropensado + 8;
    } 
    System.out.println("¿El número esta en la tarjeta 5?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    if (respuestadelusuario == 1 ) {
        System.out.println("De acuerdo");
        numeropensado = numeropensado + 16;
    } 
    System.out.println("¿El número esta en la tarjeta 6?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    if (respuestadelusuario == 1 ) {
        System.out.println("De acuerdo");
        numeropensado = numeropensado + 32;
    } 
    System.out.println("¿El número esta en la tarjeta 7?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    if (respuestadelusuario == 1 ) {
        System.out.println("De acuerdo");
        numeropensado = numeropensado + 64;
    } 
    System.out.println("El número que habias pensado era el " + numeropensado);

    }
    
}

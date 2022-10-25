import java.util.Scanner;

public class AdivinarNum {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println(" ");
    System.out.println("Piensa un número del 1 al 100");
    System.out.println(" ");

    int respuestadelusuario;
    int numeropensado;

    numeropensado=0;
    
    System.out.println("¿El número esta en la tarjeta 1?");
    System.out.println("Si=1   No=0");
    System.out.println(" ");
    respuestadelusuario= entrada.nextInt();
    System.out.println(" ");
    if (respuestadelusuario == 1 ) {
        System.out.println("Vale");
        numeropensado = numeropensado + 1;
    } else {
        System.out.println("Vale, pero no tan alegre");
    }
    System.out.println(" ");

    System.out.println("¿El número esta en la tarjeta 2?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    System.out.println(" ");
    if (respuestadelusuario == 1 ) {
        System.out.println("Vale");
        numeropensado = numeropensado + 2;
    } else {
        System.out.println("Vale, pero no tan alegre");
    }
    System.out.println(" ");

    System.out.println("¿El número esta en la tarjeta 3?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    System.out.println(" ");
    if (respuestadelusuario == 1 ) {
        System.out.println("Vale");
        numeropensado = numeropensado + 4;
    } else {
        System.out.println("Vale, pero no tan alegre");
    }
    System.out.println(" ");

    System.out.println("¿El número esta en la tarjeta 4?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    System.out.println(" ");
    if (respuestadelusuario == 1 ) {
        System.out.println("Vale");
        numeropensado = numeropensado + 8;
    } else {
        System.out.println("Vale, pero no tan alegre");
    }
    System.out.println(" ");
   
    System.out.println("¿El número esta en la tarjeta 5?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    System.out.println(" ");
    if (respuestadelusuario == 1 ) {
        System.out.println("Vale");
        numeropensado = numeropensado + 16;
    } else {
        System.out.println("Vale, pero no tan alegre");
    }
    System.out.println(" ");
   
    System.out.println("¿El número esta en la tarjeta 6?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    System.out.println(" ");
    if (respuestadelusuario == 1 ) {
        System.out.println("Vale");
        numeropensado = numeropensado + 32;
    } else {
        System.out.println("Vale, pero no tan alegre");
    }
    System.out.println(" ");
  
    System.out.println("¿El número esta en la tarjeta 7?");
    System.out.println("Si=1   No=0");
    respuestadelusuario= entrada.nextInt();
    System.out.println(" ");
    if (respuestadelusuario == 1 ) {
        System.out.println("Vale");
        numeropensado = numeropensado + 64;
    } else {
        System.out.println("Vale, pero no tan alegre");
    }
    System.out.println(" ");
   
    System.out.println("El número que habias pensado era el " + numeropensado);

    entrada.close();

    }
    
}

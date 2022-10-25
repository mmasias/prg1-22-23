EJERCICIO NUMERO ESCOGIDO: 

import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {

    Scanner x = new Scanner(System.in);

    int respuesta;
    int numeroescogido;

    System.out.println("Elige un número del 1 al 99, incluidos");

    numeroescogido=0;

    System.out.println("¿El número esta en la tarjeta 1?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("");
        numeroescogido = numeroescogido + 1;
    } 
    System.out.println("¿El número esta en la tarjeta 2?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("");
        numeroescogido = numeroescogido + 2;
    } 

    System.out.println("¿El número esta en la tarjeta 3?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("");
        numeroescogido = numeroescogido + 4;
    } 

    System.out.println("¿El número esta en la tarjeta 4?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("");
        numeroescogido = numeroescogido + 8;
    } 

    System.out.println("¿El número esta en la tarjeta 5?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("");
        numeroescogido = numeroescogido + 16;
    } 

    System.out.println("¿El número esta en la tarjeta 6?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("");
        numeroescogido = numeroescogido + 32;
    } 

    System.out.println("¿El número esta en la tarjeta 7?");
    System.out.println("Si=1   No=0");
    respuesta = x.nextInt();

    if (respuesta == 1 ) {
        System.out.println("");
        numeroescogido = numeroescogido + 64;
    } 

    System.out.println("Y el numero que has escogido es...:" + numeroPensado);

    }

}






EJERCICIO MONEDA:

import java.util.Scanner;

public class Moneda {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //JUEGO DE LA MONEDA, CARA O CRUZ
       
        System.out.println("elige un lado");
       
        System.out.println("1 = Cara ");
        System.out.println("2 = Cruz ");
       
        int ladoElegido = sc.nextInt();


        
        System.out.println("*se lanza la moneda*");

        int moneda = (int) (Math.random() * 10) ;

        
        if (moneda <= 5 && ladoElegido == 1){
            System.out.println("Ha salido cara");
        } else if (moneda > 5 && ladoElegido == 2){
            System.out.println("Ha salido cruz");
        } else if (moneda <= 5 && ladoElegido == 2){
            System.out.println("Ha salido cara");
        } else if (moneda > 5 && ladoElegido == 1){
            System.out.println("Ha salido cruz");
        } else {
            
        }



    }
}


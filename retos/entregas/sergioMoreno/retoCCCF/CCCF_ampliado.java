import java.util.Scanner;

public class CCCF_ampliado {
    public static void main(String[] args){

    Scanner x = new Scanner(System.in);

    //VARIABLES
    int caja1;
    caja1 = 0;

    int caja2;
    caja2 = 0;

    int caja3;
    caja3 = 0;

    int caja4;
    caja4 = 0;

    int caja5;
    caja5 = 0;

    int caja6;
    caja6 = 0;

    int cola;
    cola = 0;

    int contadorPersonas;
    contadorPersonas = 0;

    int minutosCola;
    minutosCola = 0;

    int contadorCaja1;
    contadorCaja1 = 0;

    int contadorCaja2;
    contadorCaja2 = 0;

    int contadorCaja3;
    contadorCaja3 = 0;

    int contadorCaja4;
    contadorCaja4 = 0;

    int contadorCaja5;
    contadorCaja5 = 0;

    int contadorCaja6;
    contadorCaja6 = 0;

    int interruptorCaja1;
    int interruptorCaja2;
    int interruptorCaja3;
    int interruptorCaja4;
    int interruptorCaja5;
    int interruptorCaja6;

    
    System.out.println("¿Que cajas quieres que funcionen?");
    System.out.println("SI = 1");
    System.out.println("NO = 0");
    System.out.println("=======================================================");

    System.out.println("Caja 1: ");
    interruptorCaja1 = x.nextInt();

    System.out.println("Caja 2: ");
    interruptorCaja2 = x.nextInt();

    System.out.println("Caja 3: ");
    interruptorCaja3 = x.nextInt();

    System.out.println("Caja 4: ");
    interruptorCaja4 = x.nextInt();

    System.out.println("Caja 5 (Solo cuando la cola >= 15): ");
    interruptorCaja5 = x.nextInt();

    System.out.println("Caja 6: ");
    interruptorCaja6 = x.nextInt();

    System.out.println("=======================================================");
    

    for(int minuto = 0; minuto <= 720; minuto = minuto + 1){

        double probabilidadCliente = Math.random(); 

        if (probabilidadCliente <= 0.4){
            cola++;
            contadorPersonas++;
            System.out.println("MINUTO " + minuto + " - " + " Llega 1 cliente " + " - " + " En cola: " + cola);

        } else{

            System.out.println("MINUTO " + minuto + " - " + " No llega ningun cliente " + " - " + " En cola: " + cola);

        }

        //CAJA 1
        if(interruptorCaja1 == 1){
            if (caja1 <=0 && cola>0){
                caja1 = (int)(Math.random()*15+5);
                contadorCaja1 = contadorCaja1 + caja1;
                cola--;
                System.out.println("Entra una persona a la caja 1 con " + caja1 + " items");
            }

            if (caja1 > 0){
                caja1--;
                System.out.println("A la caja 1 le quedan: " + caja1 + " items");
            }
        }

        //CAJA 2
        if(interruptorCaja2 == 1){
            if (caja2 <=0 && cola>0){
                caja2 = (int)(Math.random()*15+5);
                contadorCaja2 = contadorCaja2 + caja2;
                cola--;
                System.out.println("Entra una persona a la caja 2 con " + caja2 + " items");
            }

            if (caja2 > 0){
                caja2--;
                System.out.println("A la caja 2 le quedan: " + caja2 + " items");
            }
        }

        //CAJA 3
        if(interruptorCaja3 == 1){
            if (caja3 <=0 && cola>0){
                caja3 = (int)(Math.random()*15+5);
                contadorCaja3 = contadorCaja3 + caja3;
                cola--;
                System.out.println("Entra una persona a la caja 3 con " + caja3 + " items");
            }

            if (caja3 > 0){
                caja3--;
                System.out.println("A la caja 3 le quedan: " + caja3 + " items");
            }
        }

        //CAJA 4
        if(interruptorCaja4 == 1){
            if (caja4 <=0 && cola>0){
                caja4 = (int)(Math.random()*15+5);
                contadorCaja4 = contadorCaja4 + caja4;
                cola--;
                System.out.println("Entra una persona a la caja 4 con " + caja4 + " items");
            }

            if (caja4 > 0){
                caja4--;
                System.out.println("A la caja 4 le quedan: " + caja4 + " items");
            }
        }

        //CAJA 5
        if(interruptorCaja5 == 1){
            if (caja5 <=0 && cola>=15){
                caja5 = (int)(Math.random()*15+5);
                contadorCaja5 = contadorCaja5 + caja5;
                cola--;
                System.out.println("Entra una persona a la caja 5 con " + caja5 + " items");
            }

            if (caja5 > 0){
                caja5--;
                System.out.println("A la caja 5 le quedan: " + caja5 + " items");
            }
        }

        //CAJA 6
        if(interruptorCaja6 == 1){
            if (caja6 <=0 && cola>0){
                caja6 = (int)(Math.random()*15+5);
                contadorCaja6 = contadorCaja6 + caja6;
                cola--;
                System.out.println("Entra una persona a la caja 6 con " + caja6 + " items");
            }

            if (caja6 > 0){
                caja6--;
                System.out.println("A la caja 6 le quedan: " + caja6 + " items");
            }
        }


        System.out.println("-----------------------------------------------------");

        if (cola == 0){
            minutosCola++;
        }

    }

    System.out.println("RESUMEN:");
    System.out.println("=======================================================");
    System.out.println("El total de minutos con la cola vacia fueron " + minutosCola + " minutos");
    System.out.println("Al finalizar el dia quedaron " + cola + " personas en la cola");
    System.out.println("Se atendieron un total de " + contadorPersonas + " personas en todo el dia");
    System.out.println("En total se vendieron " + (contadorCaja1+contadorCaja2+contadorCaja3+contadorCaja4+contadorCaja5) + " items en todo el dia");
    System.out.println("=======================================================");

    }
}
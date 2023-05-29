import java.util.Scanner;
import java.util.Random;

public class cccf {
    public static void main(String []args){

        // Variable/object initialization
        Random rand = new Random();
        int jornada = 12*60; //12Hours to minutes
        int itemsCliente = 0;
        int totalClients = 0;
        int totalSold = 0;
        int queue = 0;
        int timeOutOfQueue = 0;

        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int caja5 = 0;
        int caja6 = 0;


        // User authentication
        Scanner userInput = new Scanner(System.in);
        System.out.print("Login: (user/admin) ");
        String user = userInput.nextLine();

        int enCaja = 4;
        if(user.equals("admin")){
            System.out.print("Numero de cajas: ");
            enCaja = (userInput.nextInt());
        }

        for(int time=0; time<jornada; time++){
            System.out.println("Time: " + time);

            // Item Checkout system
            if(caja1>0){
                caja1 -= 1;
            } else caja1 -= caja1;
            if(caja2 >0) {
                caja2 -= 1;
            } else caja2 -= caja2;
            if(caja3>0){
                caja3 -= 1;
            } else caja3 -= caja3;
            if(caja4 >0) {
                caja4 -= 1;
            } else caja4 -= caja4;
            if(caja5 >0) {
                caja5 -= 1;
            } else caja5 -= caja5;
            if(caja6 >0) {
                caja6 -= 1;
            } else caja6 -= caja6;


            // Queue system
            if(queue==0){
                timeOutOfQueue++;
            }else{
                if(caja1==0 && queue==0){
                    queue--;
                    caja1 = itemsCliente;
                }if(caja2==0 && queue == 0){
                    queue--;
                    caja2 = itemsCliente;
                }if(caja3==0 && queue == 0){
                    queue--;
                    caja3 = itemsCliente;
                }if(caja4==0 && queue == 0){
                    queue--;
                    caja4 = itemsCliente;
                }if(caja5==0 && queue == 0){
                    queue--;
                    caja5 = itemsCliente;
                }if(caja6==0 && queue == 0){
                    queue--;
                    caja6 = itemsCliente;
                }
            }

            // Clients
            int probCliente = rand.nextInt(100);
            if (probCliente <= 40) {
                itemsCliente = rand.nextInt(15 - 5 + 1) + 5;
                System.out.println("Nuevo cliente! Items:" + itemsCliente);
                totalClients += 1;

                // Client to checkout
                if (caja1 == 0 && enCaja >= 1) {
                    caja1 = itemsCliente;
                    totalSold += itemsCliente;

                } else if (caja2 == 0 && enCaja >= 2) {
                    caja2 = itemsCliente;
                    totalSold += itemsCliente;

                } else if (caja3 == 0 && enCaja >= 3) {
                    caja3 = itemsCliente;
                    totalSold += itemsCliente;

                } else if (caja4 == 0 && enCaja >= 4) {
                    caja4 = itemsCliente;
                    totalSold += itemsCliente;

                } else if (caja5 == 0 && enCaja >= 5) {
                    caja5 = itemsCliente;
                    totalSold += itemsCliente;

                } else if (caja6 == 0 && enCaja >= 6) {
                    caja6 = itemsCliente;
                    totalSold += itemsCliente;

                } else
                    queue++;

            }

            // Real-time info
            System.out.println("Queue: "+ queue);
            System.out.println("C1: " + caja1 + " C2: " + caja2 + " C3: " + caja3 + " C4: " + caja4 + " C5: " + caja5 + " C6: " + caja6 + "\n");

        }

        userInput.close();

        // Stats
        System.out.println("\n----- Resumen: -----");
        System.out.println("Tiempo sin cola: " + timeOutOfQueue);
        System.out.println("Clientes restantes en cola: " + queue);
        System.out.println("Clientes totales: " + totalClients);
        System.out.println("Objetos vendidos: " + totalSold);

    }
}

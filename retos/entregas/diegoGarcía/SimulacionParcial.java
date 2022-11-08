package retos.entregas.diegoGarcía;

public class SimulacionParcial {
    public static void main (String[]args){

        int tiempoTotal = 10;                                       //CAMIARLO A 12*60
        double probabilidadLlegada; 
        int cola = 0;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int contadorColaVacia = 0;
        int contadorPersonasAtendidas = 0;
        int contadorItemsVendidos = 0;


        for(int minuto = 1; minuto<=tiempoTotal ; minuto++){

            probabilidadLlegada = Math.random();

            System.out.print(" Minuto "+ minuto);

            if(probabilidadLlegada <= 0.4){
                System.out.print(" --> Llego una persona");
                cola++;

            }else{
                System.out.print("");
            }
            System.out.println(" --> Personas en cola: "+cola);

            if(cola == 0){
                contadorColaVacia++;
            }
            
            if(cola > 0 && caja1 <= 0){

                cola--;
                contadorPersonasAtendidas++;
                caja1 = (int)(Math.random()*10)+5;
                contadorItemsVendidos+=caja1;
                System.out.println(" --> Pasa 1 persona a la caja 1 llevando "+ caja1 +" items");
            }

            if(caja1 > 0){
                caja1--;
                System.out.println(" La caja 1 atiende un item, quedan: "+ caja1+ " items");
            }

            if(cola > 0 && caja2 <= 0){

                cola--;
                contadorPersonasAtendidas++;
                caja2 = (int)(Math.random()*10)+5;
                contadorItemsVendidos+=caja2;
                System.out.println(" --> Pasa 1 persona a la caja 2 llevando "+ caja2 +" items");
            }

            if (caja2 > 0){
                caja2--;
                System.out.println(" La caja 2 atiende un item, quedan: "+ caja2+ " items");
            }

            if(cola > 0 && caja3 <= 0){

                cola--;
                contadorPersonasAtendidas++;
                caja3 = (int)(Math.random()*10)+5;
                contadorItemsVendidos+=caja3;
                System.out.println(" --> Pasa 1 persona a la caja 3 llevando "+ caja3 +" items");
            }

            if (caja3 > 0){
                caja3--;
                System.out.println(" La caja 3 atiende un item, quedan: "+ caja3+ " items");
            }

            if(cola > 0 && caja4 <= 0){

                cola--;
                contadorPersonasAtendidas++;
                caja4 = (int)(Math.random()*10)+5;
                contadorItemsVendidos+=caja4;
                System.out.println(" --> Pasa 1 persona a la caja 4 llevando "+ caja4 +" items");
            }

            if (caja4 > 0){
                caja4--;
                System.out.println(" La caja 4 atiende un item, quedan: "+ caja4+ " items");
            }

            

            System.out.println("\n");

        }
        System.out.println("Fin de la jornada");
        System.out.println("Han habido "+ contadorColaVacia +" minutos con la cola vacia");
        System.out.println("Al finalizar el dia quedaban "+ cola +" personas en la cola");
        System.out.println("Se atendieron a "+ contadorPersonasAtendidas +" personas el dia de hoy");
        System.out.println("Se vendieron "+ contadorItemsVendidos +" items");
    }
}

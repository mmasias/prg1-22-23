package retos.entregas.diegoGarcía;

public class SimulacionParcial {
    public static void main (String[]args){

        int tiempoTotal = 240;                                       //CAMIARLO A 12*60
        double probabilidadLlegada; 
        int cola = 0;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int caja5 = 0;
        boolean abrirCaja5 = false;
        int contadorColaVacia = 0;
        int contadorPersonasAtendidas = 0;
        int contadorItemsVendidos = 0;
        int contadorPersonasCaja5 = 0;


        for(int minuto = 1; minuto<=tiempoTotal ; minuto++){

            probabilidadLlegada = Math.random();

            System.out.print(" Minuto "+ minuto);

            if(probabilidadLlegada <= 0.5){
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

            if(cola > 15 && abrirCaja5 == false){
                abrirCaja5 = true;
                System.out.println(" Se abre la caja 5");
            }

            if(abrirCaja5 && caja5 == 0){
                if(cola>0){
                    contadorPersonasCaja5++;
                    cola--;
                    contadorPersonasAtendidas++;
                    caja5 = (int)(Math.random()*10)+5;
                    contadorItemsVendidos+=caja5;
                    System.out.println(" --> Pasa 1 persona a la caja 5 llevando "+ caja5 +" items ");
                }
            }

            if(caja5 > 0){
                caja5--;
                System.out.println(" La caja 5 atiende un item, quedan: "+ caja5+ " items");
            }

            if(abrirCaja5 && contadorPersonasCaja5 > 5 && caja5 == 0){
                abrirCaja5 = false;
                contadorPersonasCaja5 = 0;
                System.out.println(" Se cierra la caja 5");
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

package retos.entregas.diegoGarcía;

public class SimulacionParcial {
    public static void main (String[]args){

        int tiempoTotal = 60;
        double probabilidadLlegada; 
        int cola = 0;
        int caja1 = 0;


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
            

            if(cola > 0 && caja1 <= 0){

                cola--;
                caja1 = (int)(Math.random()*10)+5;
                System.out.println(" --> Pasa 1 persona a la caja 1 llevando "+ caja1 +" items");
            }

            if(caja1 > 0){
                caja1--;
                System.out.println(" La caja 1 atiende un item, quedan: "+ caja1+ " items");
            }
            System.out.println("\n");
           
        }
        System.out.println("Fin de la simulacion");
    }
}

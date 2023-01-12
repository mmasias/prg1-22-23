public class simulacionParcial {
    public static void main(String[] args){
        int totalTiempo = 12*60;
        double probabilidadLlegada;
        int unaCola = 0;
        int laCaja1 = 0;

        for(int minuto=1; minuto<=totalTiempo; minuto=minuto+1){
    
            System.out.print("minuto" + minuto);

            probabilidadLlegada = Math.random();
            if(probabilidadLlegada <= .4){
                System.out.println("-Llego una persona");
                unaCola = unaCola +1;
            }else{
                System.out.println("");
            }
            System.out.println("> Persona en cola: " + unaCola);
            if(laCaja1<=0 && unaCola>0){
                System.out.println("Pasa una persona a la caja");
                unaCola = unaCola -1;
                laCaja1 = (int)(Math.random()*10)+5;
                System.out.println("Pasa una persona a la caja 1 llevando ["+laCaja1+"] items");
            }
            if(laCaja1>0){
                laCaja1 = laCaja1 -1;
                System.out.println("prsona le quedan ["+laCaja1+"] items");
            }
        }
        System.out.println("Fin de la simulacion");
    }
}

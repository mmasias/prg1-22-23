public class RetoCCCFExtendido {
    public static void main(String[] args){
        int cola=0;
        int packsCola1 = 0;
        int packsCola2 = 0;
        int packsCola3 = 0;
        int packsCola4 = 0;
        int minsColaVacia = 0;
        int packTotal = 0;
        int totalPersonas = 0;
        int colaFinal = 0;
        
        for(int minuto=1; minuto<=720; minuto++){
            int probLlegada = (int)(Math.random()*10)+ 1;
            probLlegada = (int)(Math.random()*10) + 1;
            if(probLlegada<=4){
                cola++;
                totalPersonas++;
                if(cola>0 && packsCola1==0){
                    cola--;
                    packsCola1 = (int)(Math.random()*10) + 5;
                }else if(cola>0 && packsCola2==0){
                    cola--;
                    packsCola2 = (int)(Math.random()*10) + 5;
                }else if(cola>0 && packsCola3==0){
                    cola--;
                    packsCola3 = (int)(Math.random()*10) + 5;
                }else if(cola>0 && packsCola4==0){
                    cola--;
                    packsCola4 = (int)(Math.random()*10) + 5;
                }  
            }

            if(minuto==720){
                colaFinal=cola;
            }

            if(packsCola1>0){
                packsCola1--;
                packTotal++;
            }
            if(packsCola2>0){
                packsCola2--;
                packTotal++;
            }
            if(packsCola3>0){
                packsCola3--;
                packTotal++;
            }
            if(packsCola4>0){
                packsCola4--;
                packTotal++;
            }
            if(cola==0){
                minsColaVacia++;
            }
            
            if(probLlegada<=4){
                System.out.println("MINUTO " + minuto + " - Llega 1 persona - En cola: " + cola);
                System.out.println("Caja1:["+ packsCola1 +"] | Caja2:["+ packsCola2 +"] | Caja3:["+ packsCola3 +"] | Caja4:["+ packsCola4 +"]");
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            }
            else{
                System.out.println("MINUTO " + minuto + " - No llega nadie - En cola: " + cola);
                System.out.println("Caja1:["+ packsCola1 +"] | Caja2:["+ packsCola2 +"] | Caja3:["+ packsCola3 +"] | Caja4:["+ packsCola4 +"]");
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            }System.out.println("");
        }
        
        System.out.println("RESUMEN");
        System.out.println("============================================================");
        System.out.println("Minutos con cola en cero      : " + minsColaVacia);
        System.out.println("Personas en la cola al cierre : " + colaFinal);
        System.out.println("Personas atendidas en el dia  : " +  totalPersonas);
        System.out.println("Articulos vendidos en el dia  : " + packTotal);
        System.out.println("============================================================");
    }
}
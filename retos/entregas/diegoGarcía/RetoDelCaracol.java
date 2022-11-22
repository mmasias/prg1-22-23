public class RetoDelCaracol {
    public static void main (String[]args){
        boolean vidaCaracol = true;
        int dia = 1;
        int profundidadAgua = 20;
        double caida =(Math.random()*10)+10;
        caida = Math.round(caida*100.00)/100.00;
        double subida;
        double caidaNoches;
        double alturaFinal = caida;
        double probabilidadCoche;
        double probabilidadLluiaDebil;
        double probabilidadLluviaFuerte;
        boolean coche = false;
        System.out.println("El caracol cae a una altura de "+ caida +" metros");

        while(vidaCaracol){

            if(dia > 10 && dia <= 20){
                subida = (Math.random()*2)+1;
                subida = Math.round(subida*100.00)/100.00;
                caidaNoches = Math.random()*2;
                caidaNoches = Math.round(caidaNoches*100.00)/100.00;
                alturaFinal = caida - (subida - caidaNoches);
                alturaFinal = Math.round(alturaFinal*100.00)/100.00;
            }else if(dia > 20 && dia < 50){
                subida = (Math.random()*1)+1;
                subida = Math.round(subida*100.00)/100.00;
                caidaNoches = Math.random()*2;
                caidaNoches = Math.round(caidaNoches*100.00)/100.00;
                alturaFinal = caida - (subida - caidaNoches);
                alturaFinal = Math.round(alturaFinal*100.00)/100.00;
            }else if(dia == 50){
                break;
            }else{
                subida = (Math.random()*3)+1;
                subida = Math.round(subida*100.00)/100.00;
                caidaNoches = Math.random()*2;
                caidaNoches = Math.round(caidaNoches*100.00)/100.00;
                alturaFinal = caida - (subida - caidaNoches);
                alturaFinal = Math.round(alturaFinal*100.00)/100.00;
            }

            probabilidadCoche = Math.random();
            if(probabilidadCoche <= 0.35){
                coche = true;
                System.out.println("Vaya un coche aparco al lado, el caracol desciende");
                caidaNoches+=2;
                alturaFinal+=2;
            }


            probabilidadLluviaFuerte = Math.random();
            probabilidadLluiaDebil = Math.random();
            
            if(probabilidadLluviaFuerte <= 0.05){
                profundidadAgua -=5;
                System.out.println("Lueve fuertemente");
            }else if(probabilidadLluiaDebil <= 0.1){
                profundidadAgua -= 2;
                System.out.println("Llueve debilmete");
            }


            System.out.println("[Dia "+ dia +"] / Sube: ["+ subida +"] / Baja: ["+ caidaNoches +"] / Altura final del dia: ["+ alturaFinal +"]");
            System.out.println();
            for(int i = 0; i <=20 ; i++){

                if(i == 0){
                    if(coche){
                        coche = false;
                        System.out.println("[__]    O-=-O     [__]");
    
                    }else{
                        System.out.println("[__]              [__]");
                    }
                    
                }else if (i >= profundidadAgua){
                    System.out.println("  []~~~~~~~~~~~~~~[] _ __ "+i);
                }else if(i == (int)alturaFinal){
                    System.out.println("  []    _@)_/’    [] _ __ "+ i);
                }else{
                    System.out.println("  []:. :. :. :. :.[] _ __ "+i);
                }

            }
            System.out.println("  [][][][][][][][][] ");
            System.out.println("\n");

            if((int)alturaFinal <= 0 || (int)alturaFinal >= profundidadAgua){
                vidaCaracol = false;
            }

            dia++;
            caida = alturaFinal; 
        }

        if((int)alturaFinal <= 0){
            System.out.println("El caracol ha conseguido salir!!!!");
        }else if((int)alturaFinal >= profundidadAgua){
            System.out.println("El caracol se ahogo intentando salir en el dia "+ (dia-1));
        }else if(dia == 50){
            System.out.println("El caracol murio de inanicion tras luchar 50 dias");
        }
       
    }
}

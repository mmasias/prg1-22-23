import java.util.Random;
public class RetoCCCF {
    public static void main(String[] args) {
    double probabilidadClientenuevo;
    int caja1= 0;
    int caja2 = 0;
    int caja3 = 0;
    int caja4 = 0;
    int cola = 0;
    int horarioLaboral = 720;
    int minutosEncero=0;
    int personasDuranteeldia=0;
    int articulosTotales=0;
    int contadorItems1=0;
    int contadorItems2=0;
    int contadorItems3=0;
    int contadorItems4=0;
    
    for (int minuto = 1; minuto <= horarioLaboral; minuto = minuto+1) {
        
        probabilidadClientenuevo =Math.random();
        if (probabilidadClientenuevo <= 0.4){
            
            cola = cola + 1;
        }
        if (caja1<= 0 && cola>0){
            cola=cola-1;
            caja1= (int)(Math.random()*11)+5;
            contadorItems1 = contadorItems1 + caja1;
        } else if (caja2<= 0 && cola>0){
            cola=cola-1;
            caja2= (int)(Math.random()*11)+5;
        } else if (caja3<= 0 && cola>0){
            contadorItems2 = contadorItems2 + caja2;
            cola=cola-1;
            caja3= (int)(Math.random()*11)+5;
        } else if (caja4<= 0 && cola>0) {
            contadorItems3 = contadorItems3 + caja3;
            cola=cola-1;
            caja4= (int)(Math.random()*11)+5;
            contadorItems4 = contadorItems4 + caja4;
        }
        if (caja1>0){
            caja1=caja1-1;
            }  
        if (caja2>0){
            caja2=caja2-1;
            }  
        if (caja3>0){
            caja3=caja3-1;
            } 
        if (caja4>0){
            caja4=caja4-1;
        }
        
        if (cola== 0){
            minutosEncero= minutosEncero+1;
            }
        if (minuto==720){
            cola = cola + 0;

            }
        if (probabilidadClientenuevo <= 0.4){
            
            personasDuranteeldia = personasDuranteeldia + 1;
            }
        
            
        articulosTotales= contadorItems1 + contadorItems2+ contadorItems3 + contadorItems4;
        

        if (probabilidadClientenuevo <= 0.4){
                System.out.println(" Minuto" + minuto + "-" + " LLega 1 persona" + "-" + " En cola:" + cola);
                System.out.println(" Caja1 " + "[" + caja1 + "]" + " Caja2 " + "[" + caja2 + "]" + " Caja3 " + "[" +caja3 + "]" + " caja4 " + "[" + caja4 + "]");
                System.out.println("----------------------------------------------------------------");
                
        } else {
                System.out.println("Minuto " + minuto + "-" + " No llega nadie" + "-" + " En cola:" + cola);
                System.out.println(" Caja1 " + "[" + caja1 + "]" + " Caja2 " + "[" + caja2 + "]" + " Caja3 " + "["+ caja3 + "]" + " caja4 " + "[" + caja4 + "]");
                System.out.println("----------------------------------------------------------------");
               
        }
        

    }   

    
    System.out.println("Ha habido " + minutosEncero + " minutos, donde la cola estaba en 0");
    System.out.println("Al final del dia habia " + cola + " personas en la cola");
    System.out.println("El número de personas atendidas durante el dia es " + personasDuranteeldia );  
    System.out.println("Los items vendidos durante el dia son " + articulosTotales );  
     
    }
}

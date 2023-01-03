import java.util.Scanner;

public class WhacAMole {
    int turno;  
    public static void main(String[] args) {
        int turno=1;
        int aciertos=0;
        while(turno<16){
         int topo = (int) (Math.random ()*15)+1;
          
         System.out.println("Bienvenido a Whac-A-Mole!!!");
         System.out.print("Elige una posición para golpear entre 1 y 16: ");
         Scanner respuesta = new Scanner (System.in);
         int casilla = respuesta.nextInt();
         System.out.print("Golpe en: ["+ casilla + "]");
         System.out.println(" / Topo en: ["+ topo + "]");
         System.out.println("===============================================================");
          

    
    
        
        
         for(int i=1; i<=16; i++){
            if (i==topo && topo != casilla) {
                System.out.print("(‘’) ");
            }else if(i== topo && topo==casilla){
                System.out.print("(**) ");
            }else{
                System.out.print("(  ) ");
            }    
            if (i%4==0){
      
                System.out.println(  );      
            }
        }
       System.out.println("Turno:  " + turno ++);
       
       if(topo == casilla){   
            System.out.println("[ACIERTO]");
            aciertos = aciertos ++;
        }else{
            System.out.println("[FALLO]");
        }
        System.out.println("===============================================================");

    } System.out.println("Su número de aciertos totales es: "+ aciertos);

    }



    
}






import javax.security.auth.Subject;

public class Retocaracol {
    public static void main(String[] args){

        final int profundidadTotal = 20;
        int profundidadDelAgua = 0;
        int profundidadCaracol = (int) (Math.random() * 10) + 10;
        int dias = 0;
    
        
        final String BORDE_SUPERIOR = "[][]            [][]";
        final String PARED_DEL_POZO = "  [].:.:.:.:.:.:[]  ";
        final String PARED_CARACOL  = "  []   _@)_/’   []  ";
        final String PARED_CON_AGUA = "  []~~~~~~~~~~~~[]  ";
        final String BORDE_INFERIOR = "  [][][][][][][][]  ";
        final String BORDE_SUPERIOR_COCHE = "[][]    O-=-O     [][]";

    while(profundidadCaracol>=0){
        
        
        int sube = (int) (Math.random() * 4) + 1;
        int baja = (int) (Math.random() * 2) + 1;
        int coche= (int) (Math.random() * 10)+1;
        int clima= (int) (Math.random() * 100)+ 1;
        System.out.println("");
        System.out.println("");
        System.out.print("Dia: " + dias ++ );
        System.out.print(" // El caracol por el día sube: " + sube);
        System.out.println(" // El caracol por la noche baja: " + baja);
        if(coche<=3.5){
            System.out.println(" // Ha pasado un coche y el caracol baja 2 metros"); 
        }

        if(clima<=85){
            System.out.println(" // Hace buen clima, no sube el nivel del agua");  
        }
        if(clima>90){
            System.out.println(" // Ha llovido un poco, el nivel del agua sube 2 metros");  

        }
        if(clima<=90 && clima>85){
            System.out.println(" // Ha llovido fuertemente, el nivel del agua sube 2 metros");
        }

        if(coche<=3.5){
            System.out.println("[][]    O-=-O    [][]");
        }else{
            System.out.println(""); 
            System.out.println("[][]            [][]");
        }
           
        
        
        for (int profundidad = 1; profundidad <= profundidadTotal; profundidad = profundidad + 1) {



            if (profundidad == profundidadCaracol) {
            System.out.println(PARED_CARACOL + " __ " + profundidad);
        } else {
                if (profundidad >= profundidadTotal - profundidadDelAgua) {
                    System.out.println(PARED_CON_AGUA + " __ " + profundidad);
                } else {
                    System.out.println(PARED_DEL_POZO + " __ " + profundidad);
                }
            }
            
            System.out.println(BORDE_INFERIOR);
        
            
        }
        if(sube >0){
            profundidadCaracol = profundidadCaracol - sube;
            profundidadCaracol = profundidadCaracol + baja;
        } 
        if(coche<=3.5){
            profundidadCaracol = profundidadCaracol + 2;
        }
   
                        
  
    }    
      
}       
}

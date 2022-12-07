    import java.util.Random;

public class retoCaracol {
public static void main(String[] args){


    final int profundidadTotal = 20;
    int profundidadDelAgua = 7;
    int profundidadCaracol = 7;
    
    
    final String BORDE_SUPERIOR = "[][]            [][]";
    final String PARED_DEL_POZO = "  [].:.:.:.:.:.:[]  ";
    final String PARED_CARACOL  = "  []   _@)_/’   []  ";
    final String PARED_CON_AGUA = "  []~~~~~~~~~~~~[]  ";
    final String BORDE_INFERIOR = "  [][][][][][][][]  ";
    
    String queImprimir;
   System.out.println("Un caracol se cae a un pozo");
   System.out.println(BORDE_SUPERIOR);
    for (int profundidad = 1; profundidad <= profundidadTotal; profundidad = profundidad + 1) {
        if (profundidad == profundidadCaracol) {
            queImprimir = PARED_CARACOL;
        } else {
            if (profundidad >= profundidadTotal - profundidadDelAgua) {
                queImprimir = PARED_CON_AGUA;
            } else {
                queImprimir = PARED_DEL_POZO;
            }
        }
        System.out.println(queImprimir + " __ " + profundidad);
    }
    System.out.println(BORDE_INFERIOR);

    for (int dias = 10; dias != 0; dias = dias-1){
        Random rnd = new Random();
        int sube =(int)(rnd.nextDouble() * 4 + 1);
        int baja = (int)(rnd.nextDouble() * 2 + 1);
        int profundidadCaracolm = profundidadCaracol-sube;
        int profundidadCaracoln = profundidadCaracolm+baja;
        int profundidadFinal = profundidadCaracoln;
        System.out.println("Por la mañana el caracol "+profundidadCaracolm+" metros y por la noche bajo "+profundidadCaracoln+" metros");
        
        if (profundidadFinal <=0 ){
            System.out.println("EL CARACOL SALIO DEL POZO");
            break;
        }else if(dias!=0 && profundidadFinal>0){
            System.out.println(BORDE_SUPERIOR);
            for (int profundidad = 1; profundidad <= profundidadTotal; profundidad = profundidad + 1) {
                if (profundidad == profundidadFinal) {
                    queImprimir = PARED_CARACOL;
                    profundidadCaracol = profundidadCaracoln;
                } else {
                    if (profundidad >= profundidadTotal - profundidadDelAgua) {
                        queImprimir = PARED_CON_AGUA;
                    } else {
                        queImprimir = PARED_DEL_POZO;
                    }
                }
                
                System.out.println(queImprimir + " __ " + profundidad);
            }
            System.out.println(BORDE_INFERIOR);
        }else if (dias ==0 && profundidadFinal>0){
            System.out.println("El caracol murio en el pozo");
            break;
        
    }
    
    
}    
}}

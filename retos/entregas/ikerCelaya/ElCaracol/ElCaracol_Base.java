public class ElCaracol_Base {
    public static void main(String[] args){

        final int profundidadTotal = 20;
        int profundidadCaracol = (int)(Math.random()*10+10);
        int dia = 0;
        
        final String BORDE_SUPERIOR = "[][]            [][]";
        final String PARED_DEL_POZO = "  [].:.:.:.:.:.:[]  ";
        final String PARED_CARACOL  = "  []   _@)_/'   []  ";
        final String PARED_CON_AGUA = "  []~~~~~~~~~~~~[]  ";
        final String BORDE_INFERIOR = "  [][][][][][][][]  ";

        String queImprimir;

        System.out.println(BORDE_SUPERIOR);
        for (int profundidad = 1; profundidad <= profundidadTotal; profundidad = profundidad + 1) {
            if (profundidad == profundidadCaracol) {
                queImprimir = PARED_CARACOL;
            } else {
                if (profundidad == 20) {
                    queImprimir = PARED_CON_AGUA;
                } else {
                    queImprimir = PARED_DEL_POZO;
                }
            }
            System.out.println(queImprimir + " __ " + profundidad);
        }
        System.out.println(BORDE_INFERIOR);

        while(profundidadCaracol > 1){
            dia ++;
            float avance = (float)(Math.random()*4+1);
            float descenso = (float)(Math.random()*2+0);
            System.out.printf("Dia:  %d  /  Sube: %.2f  /  Desciende: %.2f metros  /  Altura al final del dia: %.2f metros \n",dia,avance,descenso,profundidadCaracol - avance + descenso);
            profundidadCaracol = Math.round(profundidadCaracol - avance);
            profundidadCaracol = Math.round(profundidadCaracol + descenso);
            
            System.out.println(BORDE_SUPERIOR);
            for (int profundidad = 1; profundidad <= profundidadTotal; profundidad = profundidad + 1) {
                if (profundidad == profundidadCaracol) {
                    queImprimir = PARED_CARACOL;
                } else {
                    if (profundidad == 20) {
                        queImprimir = PARED_CON_AGUA;
                    } else {
                        queImprimir = PARED_DEL_POZO;
                    }
                }
                System.out.println(queImprimir + " __ " + profundidad);
            }
            System.out.println(BORDE_INFERIOR + "\n");          
        }

    }
}

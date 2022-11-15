public class UnPozoConAguaConCaracolMasLimpio {
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
    }    
}

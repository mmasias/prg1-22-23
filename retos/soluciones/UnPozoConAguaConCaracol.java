public class UnPozoConAguaConCaracol {
    public static void main(String[] args){

        final int profundidadTotal = 20;
        int profundidadDelAgua = 7;
        int profundidadCaracol = 7;
        
        final String BORDE_SUPERIOR = "[][]            [][]";
        final String PARED_DEL_POZO = "  [].:.:.:.:.:.:[]  ";
        final String PARED_CARACOL  = "  []   _@)_/’   []  ";
        final String PARED_CON_AGUA = "  []~~~~~~~~~~~~[]  ";
        final String BORDE_INFERIOR = "  [][][][][][][][]  ";

        System.out.println(BORDE_SUPERIOR);
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
        }
        System.out.println(BORDE_INFERIOR);
    }    
}

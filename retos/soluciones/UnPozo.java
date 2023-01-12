class UnPozo {
    public static void main(String[] args){

        final int profundidadTotal = 20;

        final String BORDE_SUPERIOR = "[][]            [][]";
        final String PARED_DEL_POZO = "  [].:.:.:.:.:.:[]  ";
        final String BORDE_INFERIOR = "  [][][][][][][][]  ";

        System.out.println(BORDE_SUPERIOR);
        for (int profundidad = 1; profundidad <= profundidadTotal; profundidad = profundidad + 1) {
            System.out.println(PARED_DEL_POZO + " __ " + profundidad);
        }
        System.out.println(BORDE_INFERIOR);
    }
}
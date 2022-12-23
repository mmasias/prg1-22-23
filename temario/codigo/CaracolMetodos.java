class CaracolMetodos {

    public static void main(String[] args){

        int profundidadCaracol;
        final int profundidadPozo = 20;
        int profundidadAgua;

        profundidadCaracol = (int)(Math.random()*15)+1;
        profundidadAgua = 0;

        boolean caracolFuera = false;
        boolean quedanDias = true;

        do {
            profundidadCaracol = sube(profundidadCaracol) - 
            dibujaPozo(profundidadPozo, profundidadAgua, profundidadCaracol);

        } (!caracolFuera && quedanDias);

        
        


    }

    private static void dibujaPozo(int profundidadPozo, int profundidadAgua, int profundidadCaracol) {
        final String BORDE_SUPERIOR = "[][]            [][]";
        final String PARED_DEL_POZO = "  [].:.:.:.:.:.:[]  ";
        final String PARED_CARACOL  = "  []   _@)_/’   []  ";
        final String PARED_CON_AGUA = "  []~~~~~~~~~~~~[]  ";
        final String BORDE_INFERIOR = "  [][][][][][][][]  ";

        String queImprimir;

        System.out.println(BORDE_SUPERIOR);
        for (int profundidad = 1; profundidad <= profundidadPozo; profundidad = profundidad + 1) {
            if (profundidad == profundidadCaracol) {
                queImprimir = PARED_CARACOL;
            } else {
                if (profundidad >= profundidadPozo - profundidadAgua) {
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

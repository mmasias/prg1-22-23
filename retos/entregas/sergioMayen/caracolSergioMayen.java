public class caracolSergioMayen {
    public static void main(String[] args){

        final int profundidadTotal = 20;
        boolean caracolWin = false;
        //int profundidadDelAgua = 7;
        int profundidadCaracol = 20;
        int dias = 0, numeroMetrosSubidos = 0, numeroMetrosBajados = 0;
        
        final String BORDE_SUPERIOR = "[][]            [][]";
        final String PARED_DEL_POZO = "  [].:.:.:.:.:.:[]  ";
        final String PARED_CARACOL  = "  []   _@)_/’   []  ";
        final String PARED_CON_AGUA = "  []~~~~~~~~~~~~[]  ";
        final String BORDE_INFERIOR = "  [][][][][][][][]  ";
        final String BORDE_WIN =      "  []---WINNER---[]  ";

        String queImprimir;

        do{
            numeroMetrosBajados = (int)Math.floor(Math.random()* (2 - 0)) + 0;
            numeroMetrosSubidos = (int)Math.floor(Math.random()* (4 - 1)) + 1;
            caracolWin = profundidadCaracol <= 0;
            if(caracolWin){
                System.out.println(BORDE_WIN);
            }
            else{
                System.out.println(BORDE_SUPERIOR);
            }
            for (int profundidad = 1; profundidad <= profundidadTotal; profundidad++) {            
                if (profundidad == profundidadCaracol) {
                    profundidadCaracol = profundidadCaracol - numeroMetrosSubidos;
                    profundidadCaracol = profundidadCaracol + numeroMetrosBajados;
                    queImprimir = PARED_CARACOL;
                } else {
                    queImprimir = PARED_DEL_POZO;
                }
                System.out.println(queImprimir + " __ " + profundidad);
            }
            System.out.println(BORDE_INFERIOR);

            dias = dias + 1;

            if(caracolWin){
                System.out.println("EL CARACOL HA ESCAPADO!!");
                break;
            }
            else{
                System.out.println("El Caracol lleva "+ dias + " dias intentado salir del pozo");
                if(dias<15){
                    System.out.println("El Caracol sube "+ numeroMetrosSubidos + " en este dia");
                    System.out.println("El Caracol bajo "+ numeroMetrosBajados + " en este dia");                }
            }
        } while (dias < 15);

        if(dias>= 15 && !caracolWin){
            System.out.println("EL CARACOL SE HA MUERTO!!");
        }
    }    
}

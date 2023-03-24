public class Caracol2 {
    public static void main(String[] args) {
        int profundidadTotal = 20;
        int subidaMañana;
        int caidaNoche;
        int posicionCaracol = (int) ((Math.random() * (20 - 10 + 1) + 10));
        int dia = 0;

        String BORDE_SUPERIOR = "[][]            [][]";
        String PARED_DEL_POZO = "  [].:.:.:.:.:.:[]  ";
        String PARED_CARACOL = "  []   _@)_/’   []  ";
        String PARED_CON_AGUA = "  []~~~~~~~~~~~~[]  ";
        String BORDE_INFERIOR = "  [][][][][][][][]  ";

        while (posicionCaracol >= 0) {

            dia++;

            subidaMañana = (int) (Math.random() * (5 - 1) + 1);
            caidaNoche = (int) (Math.random() * (2 - 0) + 1);
            System.out.println(" Dia [" + dia + "] /  Sube: [" + subidaMañana + "] / Baja: [" + caidaNoche
                    + "] / Altura al final del dia: [" + posicionCaracol + "]");

            if (dia >= 0) {
                posicionCaracol = posicionCaracol - subidaMañana + caidaNoche;
            }
            if (posicionCaracol < 0) {
                System.out.println("haz salido");
            }
            System.out.println(BORDE_SUPERIOR);
            for (int profundidad = 0; profundidad <= profundidadTotal; profundidad++) {
                if (posicionCaracol == profundidad) {
                    System.out.println(PARED_CARACOL + " __ " + profundidad);
                } else {
                    System.out.println(PARED_DEL_POZO + " __ " + profundidad);
                }
            }
            System.out.println(BORDE_INFERIOR);

        }
    }
}

public class retoCaracol {

    public static void main(String[] args) {

        int profundidadTotal = 20;
        int ascenso = 0;
        int descenso = 0;
        int profundidadCaracol = 10 + (int) (Math.random() * 11);
        int dia = 0;
        int profundidadAgua = 20;
        String PARED_COCHE    = "[__]    O-=-O     [__]";
        String BORDE_SUPERIOR = "[][]            [][]";
        String PARED_DEL_POZO = "  [].:.:.:.:.:.:[]  ";
        String PARED_CARACOL  = "  []   _@)_/’   []  ";
        String PARED_CON_AGUA = "  []~~~~~~~~~~~~[]  ";
        String BORDE_INFERIOR = "  [][][][][][][][]  ";

        System.out.println("El Caracol ha caido en un pozo a una profundidad de:  [" + profundidadCaracol + "]");

        do {
            dia++;

            if (dia > 0) {
                ascenso = (int) (Math.random() * 4) + 1;
                descenso = (int) (Math.random() * 3);
                profundidadCaracol = (profundidadCaracol + descenso) - ascenso;

                if (dia > 10) {
                    ascenso = (int) (Math.random() * 3) + 1;
                    descenso = (int) (Math.random() * 3);
                    profundidadCaracol = (profundidadCaracol + descenso) - ascenso;
                }

                if (dia > 20) {
                    ascenso = (int) (Math.random() * 2) + 1;
                    descenso = (int) (Math.random() * 3);
                    profundidadCaracol = (profundidadCaracol + descenso) - ascenso;
                }

                int probabilidadCoche = (int) (Math.random() * 100) + 1;
                if (probabilidadCoche >= 35) {
                    descenso += 2;
                    profundidadCaracol = (profundidadCaracol + descenso) + ascenso;
                } else {
                }

                int probabilidadClima = (int) (Math.random() * 100) + 1;
                if (probabilidadClima >= 5) {
                    profundidadAgua -= 5;
                } else if (probabilidadClima >= 10) {
                    profundidadAgua -= 2;
                } else {
                }

                if (profundidadCaracol > profundidadTotal) {

                    profundidadCaracol = 20;
                }
                if(profundidadCaracol > profundidadTotal-profundidadAgua){
                    profundidadCaracol = profundidadTotal - profundidadAgua;
                }

                if (profundidadCaracol < 0) {
                    profundidadCaracol = 1;
                    System.out.println("El Caracol ha salido del pozo");
                }
                System.out.print("Dia: [" + dia + "] / ");
                System.out.print("Por la mañana ha subido: [" + ascenso + "] metros / ");
                System.out.print("Por la noche ha bajado: [" + descenso + "] metros / ");
                System.out.print("La altura final del caracol durante el dia es: [" + profundidadCaracol + "]");
                System.out.println("");

                if (probabilidadCoche >= 35) {
                    System.out.println("Pasa un coche");
                    System.out.println(PARED_COCHE);
                }
            }

            for (int i = 0; i <= profundidadTotal; i++)

                if (i == 0) {

                    if (i == 0 && profundidadCaracol <= 0) {

                        System.out.println(PARED_CARACOL);
                    } else {
                        System.out.println(BORDE_SUPERIOR);

                    }
                }

                else if (i == profundidadCaracol) {

                    System.out.println(PARED_CARACOL + "_ __" + i);
                }

                else if (i > profundidadTotal - profundidadAgua) {
                    System.out.println(PARED_CON_AGUA + "_ __" + i);
                }
                else {
                    System.out.println(PARED_DEL_POZO + "_ __" + i);
                }
                System.out.println(BORDE_INFERIOR);
                    



        } while (profundidadCaracol >= 1 && dia <= 50);
    }
}

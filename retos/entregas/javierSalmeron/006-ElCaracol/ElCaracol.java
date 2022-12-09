public class ElCaracol {
    public static void main(String[] args) {

        /*
         * IDEA:
         * Pozo de 20m
         * empieza entre 10 y 20m
         * Dia + 1;4m
         * Noceh - 0;2m
         * INFO: H caracol, dia, progreso dia, progreso noche.
         * 
         */

        int profundidadPozo = 20;
        int profundidadAgua = profundidadPozo;

        int caracolBajoTierra = (int) (Math.random() * (20 - 10 + 1)) + 10;

        int sube;
        int baja;

        boolean escapa = false;
        boolean coche = false;

        System.out.println("El caracol se ha caido en un pozo de " + profundidadAgua + " metros de profundidad.");
        System.out.println("Actualmente se encuentra en una altura de " + caracolBajoTierra + " metros bajo tierra. \n");

        for (int dia = 1; dia <= 50; dia++) {
            System.out.println("----- Día: " + dia + " -----");
            int subidaMax = 4;
            if (dia > 10 && dia <= 20) { // Dias 10-20 dias
                subidaMax = 3;
            } else if (dia <= 50) { // Dias 20-50
                subidaMax = 2;
            }

            // Día (sube entre 1 y subidaMax)
            sube = (int) (Math.random() * (subidaMax - 1 + 1)) + 1;
            // Noche (baja entre 0 y 2)
            baja = (int) (Math.random() * (2 + 1));

            System.out.println("Por el dia sube " + sube + " metros, y por la noche baja " + baja + " metros.");

            caracolBajoTierra -= (sube - baja);

            int probabilidadLluvia = (int) (Math.random() * (100 + 1));
            if (probabilidadLluvia < 5) {
                System.out.println("Hay lluvia fuerte, el nivel del agua sube 5 metros.");
                profundidadAgua -= 5;
            } else if (probabilidadLluvia < 10) {
                System.out.println("Hay lluvia debil, el nivel del agua sube 2 metros.");
                profundidadAgua -= 2;
            }

            // Puede pasar un choche
            int probabilidadCoche = (int) (Math.random() * (100 + 1));
            if (probabilidadCoche < 35) {
                System.out.println("Pasa un coche y el caracol cae 2 metros.");
                caracolBajoTierra += 2;
                coche = true;
            } else coche = false;

            // Output datos en ASCII
            for (int graficoASCII = 0; graficoASCII <= profundidadPozo+1; graficoASCII++) {

                if (graficoASCII == 0) {
                    if (coche)
                        System.out.println("[__]    O-=-O     [__]");
                    else
                        System.out.println("[__]              [__]");

                } else if (graficoASCII == profundidadPozo+1) {
                    System.out.println("  [][][][][][][][][] ");

                } else if (graficoASCII >= profundidadAgua) {
                    System.out.println("  []~~~~~~~~~~~~~~[] -" + graficoASCII);

                } else if (graficoASCII == caracolBajoTierra) {
                    System.out.println("  []:.  _@)_/´  :.[] -" + graficoASCII);

                } else {
                    System.out.println("  []:. :. :. :. :.[] -" + graficoASCII);
                }
            }

            System.out.println("El caracol se encuentra a " + caracolBajoTierra + " metros de profundidad");
            System.out.println("El agua se encuentra a " + profundidadAgua + " metros");

            if (caracolBajoTierra < 0)
                caracolBajoTierra = 0; // No permitir numeros negativos como resultado
            if (caracolBajoTierra == 0) {
                escapa = true;
                break;
            } else if (caracolBajoTierra >= profundidadAgua) {
                break;
            }

        }

        // Fin del juego
        System.out.println("----- Fin del juego -----");
        String resultado = escapa ? "El caracol ha escapado!" : "El caracol ha muerto";
        System.out.println(resultado);
    }

}

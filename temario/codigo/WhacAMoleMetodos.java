import java.util.Scanner;

class WhacAMoleMetodos {

    static final int NUMERO_FILAS = 4;
    static final int NUMERO_COLUMNAS = 4;
    static final int NUMERO_CELDAS = NUMERO_FILAS * NUMERO_COLUMNAS;

    static final String MONIGOTE = "('v')";
    static final String CASILLA = "(   )";
    static final String MAZO = "[   ]";
    static final String ACERTO = "[*v*]";
    static final String SALTO_DE_LINEA = "\n";

    public static void main(String[] args) {

        final int NUMERO_TURNOS = 15;
        int posicionJugador;
        int[] posicionMonigotes = { 0, 0, 0, 0 };
        int aciertos = 0;

        for (int i = 1; i <= NUMERO_TURNOS; i++) {
            posicionJugador = pideEntero();
            definePosicionMonigotes(posicionMonigotes);
            if (hayMonigote(posicionJugador, posicionMonigotes)) {
                aciertos++;
            }
            imprimeTablero(posicionJugador, posicionMonigotes);
        }
        System.out.println("Al final de los turnos ha logrado " + aciertos + " aciertos");
    }

    private static void imprimeTablero(int posicionJugador, int[] posicionMonigotes) {

        String queImprimir;

        for (int i = 1; i <= NUMERO_CELDAS; i++) {
            queImprimir = CASILLA;
            if (i == posicionJugador) {
                queImprimir = MAZO;
            }
            if (hayMonigote(i, posicionMonigotes)) {
                queImprimir = MONIGOTE;
            }
            if (hayMonigote(posicionJugador, posicionMonigotes) && i == posicionJugador) {
                queImprimir = ACERTO;
            }
            if (i % NUMERO_COLUMNAS == 0) {
                queImprimir = queImprimir + SALTO_DE_LINEA;
            }
            System.out.print(queImprimir);
        }
    }

    private static boolean hayMonigote(int posicion, int[] posicionMonigotes) {

        for (int i = 0; i < posicionMonigotes.length; i++) {
            if (posicion == posicionMonigotes[i]) {
                return true;
            }
        }
        return false;
    }

    private static void definePosicionMonigotes(int[] posicionMonigotes) {

        for (int i = 0; i < posicionMonigotes.length; i++) {
            posicionMonigotes[i] = (int) ((Math.random() * NUMERO_CELDAS) + 1);
        }
    }

    static int pideEntero() {

        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
}

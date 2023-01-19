import java.util.Random;
import java.util.Scanner;

public class Mundo2DFantasma {

    static final int FILA = 0;
    static final int COLUMNA = 1;

    static final int ARRIBA = 1;
    static final int ABAJO = 2;
    static final int IZQUIERDA = 3;
    static final int DERECHA = 4;

    static final int[][] MOVIMIENTOS = {
            { 0, 0 },
            { -1, 0 },
            { 1, 0 },
            { 0, -1 },
            { 0, 1 }
    };

    static final char[] TECLAS = { 'x', 'w', 's', 'a', 'd' };

    public static void main(String[] args) {

        int[][] elMapa = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 0, 0, 1, 0, 4, 4, 4, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        };

        int[] elPersonaje = { 1, 3 };
        int[] elFantasma = {1,1};
        Random rand = new Random();

        do {
            imprimeMundo(elMapa, elPersonaje, elFantasma);
            definePosicion(elPersonaje);
            mueveFantasma(elFantasma, rand, elMapa);
            if(elPersonaje[FILA] == elFantasma[FILA] && elPersonaje[COLUMNA] == elFantasma[COLUMNA]) {
                System.out.println("¡Perdiste! El fantasma te atrapó.");
                break;
            }
        } while (true);
    }

    private static void definePosicion(int[] elPersonaje) {

        switch (capturaMovimiento()) {
			case ARRIBA:
				mueve(elPersonaje, ARRIBA);
				break;
			case ABAJO:
				mueve(elPersonaje, ABAJO);
				break;
			case IZQUIERDA:
				mueve(elPersonaje, IZQUIERDA);
				break;
			case DERECHA:
				mueve(elPersonaje, DERECHA);
				break;
		}
    }

	private static int capturaMovimiento() {

		switch (preguntaChar()) {
			case 's', 'S', '8':
				return ABAJO;
			case 'w', 'W', '2':
				return ARRIBA;
			case 'a', 'A', '4':
				return IZQUIERDA;
			case 'd', 'D', '6':
				return DERECHA;
		}
		return 0;
	}

    private static void imprimeMundo(int[][] unMapa, int[] unPersonaje, int[] elFantasma) {

        for (int fila = 0; fila < unMapa.length; fila++) {
			for (int columna = 0; columna < unMapa[fila].length; columna++) {
				if (fila == unPersonaje[FILA] && columna == unPersonaje[COLUMNA]) {
					imprimePersonaje();
				}else if(fila == elFantasma[FILA] && columna == elFantasma[COLUMNA]){
					imprimeFantasma();
				} else {
					imprimeTerreno(unMapa[fila][columna]);
				}
			}
			System.out.println();
		}
    }

	static void imprimeTerreno(int unTile) {

		String[] terreno = {
				" . ",
				"[#]",
				"~~~",
				"vVv",
				"*oO"
		};
		System.out.print(terreno[unTile]);
	}

	static void imprimePersonaje() {

		System.out.print("_O_");
	}

	static void imprimeFantasma() {

		System.out.print(">:(");
	}

	static void mueve(int[] elPersonaje, int movimiento) {

		elPersonaje[FILA] = elPersonaje[FILA] + MOVIMIENTOS[movimiento][FILA];
		elPersonaje[COLUMNA] = elPersonaje[COLUMNA] + MOVIMIENTOS[movimiento][COLUMNA];
	}

	static int preguntaInt() {

		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}

	static String preguntaString() {

		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
	}

	static char preguntaChar() {

		Scanner entrada = new Scanner(System.in);
		return entrada.next().charAt(0);
	}

    private static void mueveFantasma(int[] elFantasma, Random rand, int[][] elMapa) {

        int movimiento = rand.nextInt(4) + 1; 
        int fila = elFantasma[FILA] + MOVIMIENTOS[movimiento][FILA];
        int columna = elFantasma[COLUMNA] + MOVIMIENTOS[movimiento][COLUMNA];
        if(fila >= 0 && fila < elMapa.length && columna >= 0 && columna < elMapa[0].length){
            elFantasma[FILA] = fila;
            elFantasma[COLUMNA] = columna;
        }
    }


}


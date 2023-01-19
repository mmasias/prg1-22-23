import java.util.Random;
import java.util.Scanner;

public class Mundo2D4Fantasmas {

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

        int[] elPersonaje = { 6, 12 };
        int[] elFantasma1 = { 1 , 1 };
		int[] elFantasma2 = { 1 , 22 };
        int[] elFantasma3 = { 11 , 22};
        int[] elFantasma4 = {11 , 1};
        Random rand = new Random();

        do {
			imprimeMundo(elMapa, elPersonaje, elFantasma1, elFantasma2, elFantasma3, elFantasma4);
			definePosicion(elPersonaje);
			mueveFantasma(elFantasma1, rand, elMapa);
			mueveFantasma(elFantasma2, rand, elMapa);
            mueveFantasma(elFantasma3, rand, elMapa);
            mueveFantasma(elFantasma4, rand, elMapa);
            if(elPersonaje[FILA] == elFantasma1[FILA] && elPersonaje[COLUMNA] == elFantasma1[COLUMNA] || elPersonaje[FILA] == elFantasma2[FILA] && elPersonaje[COLUMNA] == elFantasma2[COLUMNA] || elPersonaje[FILA] == elFantasma3[FILA] && elPersonaje[COLUMNA] == elFantasma3[COLUMNA] || elPersonaje[FILA] == elFantasma4[FILA] && elPersonaje[COLUMNA] == elFantasma4[COLUMNA]) {
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

    private static void imprimeMundo(int[][] elMapa, int[] elPersonaje, int[] elFantasma1, int[] elFantasma2, int[] elFantasma3, int[] elFantasma4) {

        for (int fila = 0; fila < elMapa.length; fila++) {
			for (int columna = 0; columna < elMapa[fila].length; columna++) {
				if (fila == elPersonaje[FILA] && columna == elPersonaje[COLUMNA]) {
					imprimePersonaje();
				}else if(fila == elFantasma1[FILA] && columna == elFantasma1[COLUMNA]){
					imprimeFantasma();
				}else if(fila == elFantasma2[FILA] && columna == elFantasma2[COLUMNA]){
					imprimeFantasma();
				}else if(fila == elFantasma3[FILA] && columna == elFantasma3[COLUMNA]){
					imprimeFantasma();
				}else if(fila == elFantasma4[FILA] && columna == elFantasma4[COLUMNA]){
					imprimeFantasma();
				} else {
					imprimeTerreno(elMapa[fila][columna]);
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
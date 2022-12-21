import java.util.Scanner;

public class Mundo2D_vClase {

	static final int FILA = 0;
	static final int COLUMNA = 1;

	static final int ARRIBA = 0;
	static final int ABAJO = 1;
	static final int IZQUIERDA = 2;
	static final int DERECHA = 3;

	static final int[][] MOVIMIENTO = {
		{-1,0},
		{1,0},
		{0,-1},
		{0,1}
	};

	public static void main(String[] args) {

		int[][] elMapa = {	
							{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
							{1,0,0,1,0,4,4,4,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
							{1,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
							{1,1,1,1,0,0,0,1,1,1,0,0,1,1,1,0,0,0,0,0,0,0,0,1},
							{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
							{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
							{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
							{1,0,0,0,0,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
							{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
							{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
							{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,1},
							{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,1},
							{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};

		int [] elPersonaje = {3,10};
		
		do {
			imprimeMundo(elMapa, elPersonaje);
			mover(elPersonaje, preguntaAdonde());
		} while(true);
	}
	
	static int preguntaAdonde(){

		System.out.println("Adonde vas?");
		return preguntaInt();
	}

	static int preguntaInt(){

		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt(); 
	}

	static String pregunta(){

		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine(); 
	}
	
	static void mover(int[] unPersonaje, int direccion){
		
		unPersonaje[FILA] +=  MOVIMIENTO[direccion][FILA];
		unPersonaje[COLUMNA] += MOVIMIENTO[direccion][COLUMNA];
	}
	
	static void imprimeMundo(int[][] unMapa, int[] unPersonaje){
		
			for (int fila=0; fila<unMapa.length; fila++){
				for (int columna=0; columna<unMapa[fila].length; columna++) {
					if (fila==unPersonaje[FILA] && columna==unPersonaje[COLUMNA]) {
						imprimePersonaje();
					} else {
						imprimeTerreno(unMapa[fila][columna]);
					}
				}
				System.out.println();
			}
	}
	
	static void imprimeTerreno(int unTile){
		
		String[] terreno = {
			" . ",
			"[#]",
			"~~~",
			"vVv",
			"*oO"
		};
		System.out.print(terreno[unTile]);
	}

	static void imprimePersonaje(){
		System.out.print("_O_");
	}

}

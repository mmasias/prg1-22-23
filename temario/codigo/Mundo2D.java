public class Mundo2D {
	public static void main(String[] args) {

		int[][] elMapa = {	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
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

		int [] elPersonaje = {5,5};
		
		imprimeMundo(elMapa, elPersonaje);
	}
	
	static void imprimeMundo(int[][] unMapa, int[] unPersonaje){
		
			for (int fila=0; fila<unMapa.length; fila++){
				for (int columna=0; columna<unMapa[fila].length; columna++) {
					if (columna==unPersonaje[0] && fila==unPersonaje[1]) {
						System.out.print("_O_");
					} else {
						imprimeTerreno(unMapa[fila][columna]);
					}
				}
				System.out.println();
			}
	}
	
	static void imprimeTerreno(int unTile){
		
		String[] terreno = {" . ","[#]","~~~","vVv","*oO",};
		System.out.print(terreno[unTile]);
	}

}
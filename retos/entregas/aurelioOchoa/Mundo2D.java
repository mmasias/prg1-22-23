public class Mundo2D {

  static int elMapa[][] = {
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

  static int elPersonaje[] = {5,9};
	static final int FILA = 0;
	static final int COLUMNA = 1;


	public static void main(String[] args) {

		imprimeMundo(elMapa, elPersonaje);
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
		
		String[] terreno = {" . ","[#]","~~~","vVv","*oO",};
		System.out.print(terreno[unTile]);
	}

	static void imprimePersonaje(){
		System.out.print("_O_");
	}

}
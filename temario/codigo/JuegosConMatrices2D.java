public class JuegosConMatrices2D{
    public static void main(String[] args) {

		int[][] unaMatriz = {	
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,2,1},
			{1,0,0,0,0,0,0,0,0,0,0,2,2,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};
		
		for (int laFila=0; laFila<unaMatriz.length; laFila++) {			
			for (int laColumna=0; laColumna<unaMatriz[laFila].length; laColumna++){
				
				if (unaMatriz[laFila][laColumna]==0) {
					System.out.print(" . ");
				} else if (unaMatriz[laFila][laColumna]==1) {
					System.out.print("[#]");
				}else if (unaMatriz[laFila][laColumna]==2) {
					System.out.print("~~~");
				}	
			}
			System.out.println();
		}
	}
}


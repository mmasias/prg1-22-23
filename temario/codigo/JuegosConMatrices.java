public class JuegosConMatrices{
    public static void main(String[] args) {

		int[] unaMatriz = {1,3,12,9,0,6};
		
		for (int i=0; i<unaMatriz.length; i++) {
		
			imprimirCajas(i,unaMatriz[i]);	
		}
	}

	static void imprimirCajas(int queCaja, int numeroDeCajas){
		
			System.out.print(queCaja + " -> ");

			for (int temporal=0; temporal<numeroDeCajas; temporal++){
				System.out.print("[#]");
			}
			System.out.println(" ("+numeroDeCajas+" cajas)");
	}
}


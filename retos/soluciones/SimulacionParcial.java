
public class SimulacionParcial {
    public static void main(String[] args) {

		int tiempoTotal = 1 * 60;
		double probabilidadLlegada;
		int unaCola;
		int laCaja1;
		
		unaCola = 0;
		laCaja1 = 0;
		for (int minuto=1; minuto <= tiempoTotal; minuto = minuto + 1) {
				
			System.out.print ("Minuto " + minuto);
			
			probabilidadLlegada = Math.random();
			if (probabilidadLlegada<=0.4) {
				System.out.println(" - Llego una persona");
				unaCola = unaCola + 1;
			} else {
				System.out.println("");
			}				
			System.out.println("> Persona en cola: " + unaCola); 
			
			if (laCaja1<=0 && unaCola>0) {
				unaCola = unaCola - 1;
				laCaja1 = (int)(Math.random()*11)+5;
				System.out.println("  >  Pasa una persona a la caja 1 llevando [" + laCaja1 + "] items");
			}
			
			if (laCaja1>0){
				laCaja1 = laCaja1 - 1;
				System.out.println("  >  La caja 1 atiende un item, le quedan " + laCaja1);
			}
			
		}
		
		
			System.out.println("Fin de la simulacion");	
    }
 }

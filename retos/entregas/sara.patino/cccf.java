import java.util.Scanner;

public class cccf {
    public static void main(String[] args) {

		int tiempoTotal = 12 * 60;
		double probabilidadLlegada;
		int unaCola = 0;
		int laCaja1 = 0;
    int laCaja2 = 0;
    int laCaja3 = 0;
    int laCaja4 = 0; 
    int totalPersonas = 0;
    int totalItemsVendidos = 0;
    int minutosColaVacia = 0;
		

		for (int minuto=1; minuto <= tiempoTotal; minuto = minuto + 1) {
				
			System.out.print ("Minuto " + minuto);
			
			probabilidadLlegada = Math.random();
			if (probabilidadLlegada<=0.4) {
				System.out.println(" - Llego una persona");
				unaCola = unaCola + 1;
        totalPersonas = totalPersonas +1;
			} else {
				System.out.println("");
			}				
			
			if (laCaja1<=0 && unaCola>0) {
				unaCola = unaCola - 1;
        totalPersonas = totalPersonas + 1;
				laCaja1 = (int)(Math.random()*11)+5;
				System.out.println("  >  Pasa una persona a la caja 1 llevando [" + laCaja1 + "] items");
			}
			if (laCaja1>0 && unaCola>0 && laCaja2<=0){
        unaCola = unaCola -1;
        totalPersonas = totalPersonas + 1;
        laCaja2 = (int)(Math.random()*11)+5;
				System.out.println("  >  Pasa una persona a la caja 1 llevando [" + laCaja2 + "] items");
      }
      if (laCaja1>0 && unaCola>0 && laCaja2>0 && laCaja3<=0){
        unaCola = unaCola -1;
        totalPersonas = totalPersonas + 1;
        laCaja3 = (int)(Math.random()*11)+5;
				System.out.println("  >  Pasa una persona a la caja 1 llevando [" + laCaja3 + "] items");
      }
      if (laCaja1>0 && unaCola>0 && laCaja2>0 && laCaja3>0 && laCaja4<=0){
        unaCola = unaCola -1;
        totalPersonas = totalPersonas + 1;
        laCaja4 = (int)(Math.random()*11)+5;
				System.out.println("  >  Pasa una persona a la caja 1 llevando [" + laCaja4 + "] items");
      }

			if (laCaja1>0){
				laCaja1 = laCaja1 - 1;
        totalItemsVendidos = totalItemsVendidos + 1;
				System.out.println("  >  La caja 1 atiende un item, le quedan " + laCaja1);
			}
      if (laCaja2>0){
				laCaja1 = laCaja2 - 1;
        totalItemsVendidos = totalItemsVendidos + 1;
				System.out.println("  >  La caja 2 atiende un item, le quedan " + laCaja2);
			}
      if (laCaja3>0){
				laCaja1 = laCaja3 - 1;
        totalItemsVendidos = totalItemsVendidos + 1;
				System.out.println("  >  La caja 1 atiende un item, le quedan " + laCaja3);
			}
      if (laCaja1>0){
				laCaja4 = laCaja4 - 1;
        totalItemsVendidos = totalItemsVendidos + 1;
				System.out.println("  >  La caja 1 atiende un item, le quedan " + laCaja4);
			}
      System.out.println("> Persona en cola: " + unaCola); 
			

      if(laCaja1<=0 || laCaja2<=0 || laCaja3<=0 || laCaja4<=0){
        minutosColaVacia = minutosColaVacia +1;
      }
		}
		
      System.out.println("En total se atendieron: " + totalPersonas + " personas en total");
      System.out.println("En total se vendieron: " + totalItemsVendidos + " items");
      System.out.println("Quedaron "+ unaCola + " personas en la cola");
      System.out.println("Pasaron "+ minutosColaVacia + " minutos donde alguna cola estuvo vacía");
			System.out.println("Fin de la simulacion");	

    }
 }

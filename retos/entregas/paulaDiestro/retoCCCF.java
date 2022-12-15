import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class retoCCCF {
    public static void main(String[] args) {

		int tiempoTotal = 12 * 60;
		double probabilidadLlegada;
		int unaCola;
		int caja1;
        int caja2;
        int caja3;
        int caja4;
		
		unaCola = 0;
		caja1 = 0;
        caja2 = 0;
        caja3 = 0;
        caja4 = 0;

		for (int minuto=1; minuto <= tiempoTotal; minuto = minuto + 1) {
				
			System.out.print ("Minuto " + minuto);
			
			probabilidadLlegada = Math.random();
			if (probabilidadLlegada<=0.4) {
				System.out.print(" - Llega una persona");
				unaCola = unaCola + 1;
			} else {
				System.out.print(" - No hay nadie");
			}				
			System.out.println(" - En cola: " + unaCola); 
			
			if (caja1<=0 && unaCola>0) {
				unaCola = unaCola - 1;
				caja1 = (int)(Math.random()*11)+5;
				
			}

            if (caja2<=0 && unaCola>0){
                unaCola = unaCola -1;
                caja2 = (int)(Math.random()*11)+5;
            }

            if (caja3<=0 && unaCola>0){
                unaCola = unaCola -1;
                caja3 = (int)(Math.random()*11)+5;
            }

            if (caja4<=0 && unaCola>0){
                unaCola = unaCola -1;
                caja4 = (int)(Math.random()*11)+5;
            }
			
			if (caja1>0){
				caja1 = caja1 - 1;
			}
			
            System.out.println("Caja1: [" + caja1 + "]");

            if (caja2>0){
                caja2 = caja2 -1;
            }

            System.out.println("Caja2: [" + caja2 + "]");

            if (caja3>0){
                caja3 = caja3 -1;
            }

            System.out.println("Caja3: [" + caja3 + "]");

            if (caja4>0){
                caja4 = caja4 -1;
            }

            System.out.println("Caja4: [" + caja4 + "]");

		}
            System.out.println("");
			System.out.println("Fin de la simulacion");	
    }
 }

import java.util.Scanner;  
public class RetoCCF { 
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
		int tiempoTotal = 1 * 60;
		double probabilidadLlegada;
		int unaCola;
		int laCaja1;
        int laCaja2;
        int laCaja3;
        int laCaja4;
        int colaencero;
        int itemsentotal;
        int colaentotal;
        int items;
		
		unaCola = 0;
		laCaja1 = 0;
        laCaja2 = 0;
        laCaja3 = 0;
        laCaja4 = 0; 
        colaencero = 0;
        itemsentotal = 0;
        colaentotal = 0;
        items=0;
		for (int minuto=1; minuto <= tiempoTotal; minuto = minuto + 1) {
				
			System.out.print ("Minuto " + minuto);
			
			probabilidadLlegada = Math.random();
			if (probabilidadLlegada<=0.4) {
				System.out.println(" - Llego una persona");
				unaCola = unaCola + 1;
                colaentotal = colaentotal + 1;
			} else {
				System.out.println("No llego nadie");
			}				
			System.out.println("> Persona en cola: " + unaCola); 
            if (unaCola==0){
                colaencero = colaencero + 1;
            }
			
			if (laCaja1<=0 && unaCola>0) {
				unaCola = unaCola - 1;
                items = (int) ((Math.random() * (15 - 5)) + 5);
                itemsentotal = itemsentotal + items;
                laCaja1 = items;
				System.out.println("  >  Pasa una persona a la caja 1 llevando [" + laCaja1 + "] items");
			}
			
			if (laCaja1>0){
				laCaja1 = laCaja1 - 1;
				System.out.println("  >  La caja 1 atiende un item, le quedan " + laCaja1);
			}
			if (laCaja2==0 && unaCola>0){
                unaCola=unaCola - 1;
                items = (int) ((Math.random() * (15 - 5)) + 5);
                itemsentotal = itemsentotal + items;
                laCaja2 = items;
				System.out.println("  >  Pasa una persona a la caja 2 llevando [" + laCaja2 + "] items");     
            }
            if (laCaja2>0){
                laCaja2=laCaja2 - 1;
                System.out.println("  >  La caja 2 atiende un item, le quedan " + laCaja2);
            }
            if (laCaja3==0 && unaCola>0){
                unaCola=unaCola - 1;
                items = (int) ((Math.random() * (15 - 5)) + 5);
                itemsentotal = itemsentotal + items;
                laCaja3 = items;
				System.out.println("  >  Pasa una persona a la caja 3 llevando [" + laCaja3 + "] items");     
            }
            if (laCaja3>0){
                laCaja3=laCaja3 - 1;
                System.out.println("  >  La caja 3 atiende un item, le quedan " + laCaja3);
            }
            if (laCaja4==0 && unaCola>0){
                unaCola=unaCola - 1;
                items = (int) ((Math.random() * (15 - 5)) + 5);
                itemsentotal = itemsentotal + items;
                laCaja4 = items;
				System.out.println("  >  Pasa una persona a la caja 4 llevando [" + laCaja4 + "] items");     
            }
            if (laCaja4>0){
                laCaja4=laCaja4 - 1;
                System.out.println("  >  La caja 4 atiende un item, le quedan " + laCaja4);
		}
		System.out.println("Espera:"+unaCola);
        System.out.print("  Caja1:[" + laCaja1 + "]");
            System.out.print("  Caja 2:[" + laCaja2 + "]");
            System.out.print("  Caja 3:[" + laCaja3 + "]");
            System.out.println("  Caja 4:[" + laCaja4 + "]");
            System.out.println("----------------------------------------");
        
    }
   System.out.println("Resumen:");
        System.out.println("========================================");
        System.out.println("Minutos con cola en cero      : " + colaencero);
        System.out.println("Personas en la cola al cierre : " + unaCola);
        System.out.println("Personas atendidas en el día  : " + (colaentotal - unaCola));
        System.out.println("Articulos vendidos en el día  : " + itemsentotal); 
        System.out.println("Fin de la simulacion"); 
 }
 
}
    

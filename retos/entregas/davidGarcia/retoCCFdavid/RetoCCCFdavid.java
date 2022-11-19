public class RetoCCCFdavid {
    public static void main(String[] args){

        double probabilidadEntradapersona;
        int cola = 0;
        int caja1 = 0;
        int caja2 = 0; 
        int caja3 = 0; 
        int caja4 = 0;
        int horarioTrabajo = 12 * 60;
        int itemCaja1 = 0;
        int itemEnCaja2 = 0; 
        int itemCaja3 = 0;
        int itemsCaja4 = 0;  
        int Atendidas = 0; 
        int productoVendido = 0;
        
        for(int minuto = 1; minuto <= horarioTrabajo; minuto = minuto + 1) {

            System.out.print ("Minuto " + minuto);

            probabilidadEntradapersona = Math.random();

            if(probabilidadEntradapersona <= 0.40) {
                System.out.println(" - Llego una persona");
				cola = cola + 1;
            } else {
                System.out.println("");
            }
            System.out.println("> Persona en fila: " + cola); 

            if(caja1 == 0 && cola >= 1) {
                caja1 =  caja1 + 1;
                cola = cola - 1;
                itemCaja1 = (int)(Math.random()*11)+5;
                productoVendido = productoVendido + itemCaja1;
                System.out.println("  >  El cliente se lleva " + itemCaja1 + " productos" );
                Atendidas = Atendidas + 1;

            } if (itemCaja1 > 0) {
                itemCaja1 = itemCaja1 - 1;
				System.out.println("  >  En la caja 1 atiende un item, le quedan " + itemCaja1);
			} if (itemCaja1 == 0) {
                caja1 = 0;
            }

            if(caja2 == 0 && cola >= 1){
                caja2 =  caja2 + 1;
                cola = cola - 1;
                itemEnCaja2 = (int)(Math.random()*11)+5;
                productoVendido = productoVendido + itemEnCaja2;
                System.out.println("  >  El cliente se lleva " + itemEnCaja2 + " productos" );
                Atendidas = Atendidas + 1;

            }if (itemEnCaja2 > 0) {
                itemEnCaja2 = itemEnCaja2 - 1;
				System.out.println("  >  En la caja 2 atiende un item, le quedan " + itemEnCaja2);
			}if (itemEnCaja2 == 0){
                caja2 = 0;
            }

            if(caja3 == 0 && cola >= 1){
                caja3 =  caja3 + 1;
                cola = cola - 1;
                itemCaja3 = (int)(Math.random()*11)+5;
                productoVendido = productoVendido+ itemCaja3;
                System.out.println("  >  El cliente se lleva " + itemCaja3 + " productos" );
                Atendidas = Atendidas + 1;

            }if (itemCaja3 > 0){
                itemCaja3 = itemCaja3 - 1;
				System.out.println("  >  En la caja 3 atiende un item, le quedan " + itemCaja3);
			}if(itemCaja3 == 0){
                caja3 = 0;
            }

            if(caja4 == 0 && cola >= 1) {
                caja4 =  caja4 + 1;
                cola = cola - 1;
                itemsCaja4 = (int)(Math.random()*11)+5;
                productoVendido = productoVendido + itemsCaja4;
                System.out.println("  >  El cliente se lleva " + itemsCaja4 + " productos" );
                Atendidas = Atendidas + 1;

            }if (itemsCaja4 > 0){
                itemsCaja4 = itemsCaja4 - 1;
				System.out.println("  >  En la caja 4 atiende un item, le quedan " + itemsCaja4 );
			}if(itemsCaja4 == 0){
                caja4 = 0;
            }
            System.out.println("Tiempo "+ horarioTrabajo + " minutos");
            System.out.println("----------------------------------------------------");
            System.out.println("La Caja 1 esta atendiendo a "+ caja1 + " persona ");
            System.out.println("La Caja 2 esta atendiendo a "+ caja2 + " persona ");
            System.out.println("La Caja 3 esta atendiendo a "+ caja3 + " persona ");
            System.out.println("La Caja 4 esta atendiendo a "+ caja4 + " persona ");
            System.out.println("Personas atendidas al final "+ Atendidas);
            System.out.println("Productos vendidos al final "+ productoVendido);
            System.out.println("----------------------------------------------------");
        }
    }
}
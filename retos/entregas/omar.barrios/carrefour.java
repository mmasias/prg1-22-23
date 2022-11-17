public class carrefour {
    public static void main(String[] args) {
        int horarioLboral = 12 * 60;
        int itemsEnCaja1 = 0;
        int itemsEnCaja2 = 0;
        int itemsEnCaja3 = 0;
        int itemsEnCaja4 = 0;
        int enFila = 0;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int personasAtendidas = 0;
        int productosVendidos = 0;
        double probabilidadCliente;

        for (int minuto = 1; minuto <= horarioLboral; minuto = minuto + 1) {
            System.out.print("Minuto " + minuto);
            probabilidadCliente = Math.random();

            if (probabilidadCliente <= 0.40) {
                System.out.println(" - Llego una persona");
                enFila = enFila + 1;
            } else {
                System.out.println("");
            }
            System.out.println("> Persona en fila: " + enFila);

            if (caja1 == 0 && enFila >= 1) {
                caja1 = caja1 + 1;
                enFila = enFila - 1;
                itemsEnCaja1 = (int) (Math.random() * 11) + 5;
                productosVendidos = productosVendidos + itemsEnCaja1;
                System.out.println("  >  El cliente lleva " + itemsEnCaja1 + " productos");
                personasAtendidas = personasAtendidas + 1;

            }
            if (itemsEnCaja1 > 0) {
                itemsEnCaja1 = itemsEnCaja1 - 1;
                System.out.println("  >  La caja 1 atiende un item, le quedan " + itemsEnCaja1);
            }
            if (itemsEnCaja1 == 0) {
                caja1 = 0;
            }

            if (caja2 == 0 && enFila >= 1) {
                caja2 = caja2 + 1;
                enFila = enFila - 1;
                itemsEnCaja2 = (int) (Math.random() * 11) + 5;
                productosVendidos = productosVendidos + itemsEnCaja2;
                System.out.println("  >  El cliente lleva " + itemsEnCaja2 + " productos");
                personasAtendidas = personasAtendidas + 1;

            }
            if (itemsEnCaja2 > 0) {
                itemsEnCaja2 = itemsEnCaja2 - 1;
                System.out.println("  >  La caja 2 atiende un item, le quedan " + itemsEnCaja2);
            }
            if (itemsEnCaja2 == 0) {
                caja2 = 0;
            }

            if (caja3 == 0 && enFila >= 1) {
                caja3 = caja3 + 1;
                enFila = enFila - 1;
                itemsEnCaja3 = (int) (Math.random() * 11) + 5;
                productosVendidos = productosVendidos + itemsEnCaja3;
                System.out.println("  >  El cliente lleva " + itemsEnCaja3 + " productos");
                personasAtendidas = personasAtendidas + 1;

            }
            if (itemsEnCaja3 > 0) {
                itemsEnCaja3 = itemsEnCaja3 - 1;
                System.out.println("  >  La caja 3 atiende un item, le quedan " + itemsEnCaja3);
            }
            if (itemsEnCaja3 == 0) {
                caja3 = 0;
            }

            if (caja4 == 0 && enFila >= 1) {
                caja4 = caja4 + 1;
                enFila = enFila - 1;
                itemsEnCaja4 = (int) (Math.random() * 11) + 5;
                productosVendidos = productosVendidos + itemsEnCaja4;
                System.out.println("  >  El cliente lleva " + itemsEnCaja4 + " productos");
                personasAtendidas = personasAtendidas + 1;

            }
            if (itemsEnCaja4 > 0) {
                itemsEnCaja4 = itemsEnCaja4 - 1;
                System.out.println("  >  La caja 4 atiende un item, le quedan " + itemsEnCaja4);
            }
            if (itemsEnCaja4 == 0) {
                caja4 = 0;
            }

            System.out.println("Tiempo " + horarioLboral + " minutos");
            System.out.println("======================================================");
            System.out.println("Caja 1 esta atendiendo a " + caja1 + " persona ");
            System.out.println("Caja 2 esta atendiendo a " + caja2 + " persona ");
            System.out.println("Caja 3 esta atendiendo a " + caja3 + " persona ");
            System.out.println("Caja 3 esta atendiendo a " + caja4 + " persona ");
            System.out.println("Personas atendidas en total " + personasAtendidas);
            System.out.println("Productos vendidos en total " + productosVendidos);
            System.out.println("======================================================");
            System.out.println("======================================================");
        }
    }
}
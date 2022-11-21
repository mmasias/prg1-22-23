import java.util.Random;

public class retoCCCF_Base {

    /*
    *
    * REQUISITOS:
    * 1. HORARIO: 9:00 - 21:00
    * 2. % llegada cliente nuevo: 60 / min
    * 3. 4 cajas atienden a clientes
    * 4. Los clientes van en fila y esperan a la siguiente caja vacía
    * 5. Caja libre = siguiente cliente (irá encargándose de los packs de la compra)
    * 6. 5 - 15 packs / cliente
    * 7. 1 caja = 1 min / pack / cliente
    *
    */

    public static Random random = new Random();

    public static final int horasLaborales = 12,
                            porcentajeLlegada = 60,
                            nCajas = 4;

    public static void main(String[] args) {

        // Si la caja esta ocupada y el nº de paquetes
        int caja1 = 0,
            caja2 = 0,
            caja3 = 0,
            caja4 = 0,
            cola = 0,
            nuevoCliente = 0,
            nItems = 0;
        float cliente = 0;

        for (int i = 0; i <= 720; i++) {

            // Ver si llega un cliente y el número de items que traería
            cliente = random.nextFloat();
            nItems =  (int) (cliente * (15 - 5) + 5);

            // Si hay nuevo cliente meterlo en una caja
            if (cliente >= 0.4f || cola >= 1) {
                if (caja1 == 0) {
                    caja1 = nItems;
                    nuevoCliente = 1;
                } else if (caja2 == 0) {
                    caja2 = nItems;
                    nuevoCliente = 2;
                } else if (caja3 == 0) {
                    caja3 = nItems;
                    nuevoCliente = 3;
                } else if (caja4 == 0) {
                    caja4 = nItems;
                    nuevoCliente = 4;
                } else {
                    cola++;
                }
            }

            // Actualizar nItems de cada caja exceptuando que haya llegado justo en ese minuto un cliente
            switch (nuevoCliente) {
                case 1:
                    if (caja2 != 0) { caja2--; }
                    if (caja3 != 0) { caja3--; }
                    if (caja4 != 0) { caja4--; }
                    break;
                case 2:
                    if (caja1 != 0) { caja1--; }
                    if (caja3 != 0) { caja3--; }
                    if (caja4 != 0) { caja4--; }
                    break;
                case 3:
                    if (caja1 != 0) { caja1--; }
                    if (caja2 != 0) { caja2--; }
                    if (caja4 != 0) { caja4--; }
                    break;
                case 4:
                    if (caja1 != 0) { caja1--; }
                    if (caja2 != 0) { caja2--; }
                    if (caja3 != 0) { caja3--; }
                    break;
                default:
                    if (caja1 != 0) { caja1--; }
                    if (caja2 != 0) { caja2--; }
                    if (caja3 != 0) { caja3--; }
                    if (caja4 != 0) { caja4--; }
            }

            // Mostrar minuto actual, si llega o no un cliente y estado de las cajas
            System.out.print(String.format("%079d", 0).replaceAll("0", "-") + "\n"
                                + "Minuto: " + i);
            if (nuevoCliente != 0) {
                System.out.print(" - Llega 1 cliente a la caja " + nuevoCliente + " - Esperando: " + cola + "\n");
            } else {
                System.out.print(" - No llega ningun cliente - Esperando: " + cola + "\n");
            }

                System.out.println(String.format("Caja 1: [%d] ", caja1)
                                 + String.format("Caja 2: [%d] ", caja2)
                                 + String.format("Caja 3: [%d] ", caja3)
                                 + String.format("Caja 4: [%d] ", caja4));

            // Reiniciar ultima caja a la que llego un cliente
            nuevoCliente = 0;
        }

    }
}

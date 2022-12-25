import java.util.Random;

public class retoCCCF_Ampliado {

    /*
     *
     * BASE:
     * 1. HORARIO: 9:00 - 21:00
     * 2. % llegada cliente nuevo: 60 / min
     * 3. 4 cajas atienden a clientes
     * 4. Los clientes van en fila y esperan a la siguiente caja vacía
     * 5. Caja libre = siguiente cliente (irá encargándose de los packs de la compra)
     * 6. 5 - 15 packs / cliente
     * 7. 1 caja = 1 min / pack / cliente
     *
     * EXTENDIDO:
     * Al final representar:
     *    - n.º de min en los que no hubo nadie en cola
     *    - n.º de personas en la cola al finalizar el dia
     *    - n.º de personas atendidas
     *    - n.º de items vendidos en el dia
     *
     * AMPLIADO:
     * 1. Caja 5 y 6 si hay más de 15 esperando
     * 2. Super Admin **
     */

    public static Random random = new Random();

    public static final int minutosLaborales = 720,
            porcentajeLlegada = 60,
            nCajas = 4;

    public static void main(String[] args) {

        // Si la caja esta ocupada y el nº de paquetes
        int caja1 = 0,
                caja2 = 0,
                caja3 = 0,
                caja4 = 0,
                caja5 = 0,
                caja6 = 0,
                cola = 0,
                nuevoCliente = 0,
                nItems = 0,
                clientesAtendidos = 0,
                nItemsVendidos = 0,
                minSinNadieEnCola = 0;
        float cliente = 0;

        // Iterar todos los minutos del dia laboral (12 h = 720 min)
        for (int i = 1; i <= minutosLaborales; i++) {

            // Ver si llega un cliente y el número de items que traería
            cliente = random.nextFloat();
            nItems = (int) (cliente * (15 - 5) + 5);

            // Si hay nuevo cliente meterlo en una caja libre
            if (cliente >= 0.4f || cola > 1) {
                if (caja1 == 0) {
                    caja1 = nItems;
                    nuevoCliente = 1;
                    if (cola != 0) {
                        cola--;
                    }
                } else if (caja2 == 0) {
                    caja2 = nItems;
                    nuevoCliente = 2;
                    if (cola != 0) {
                        cola--;
                    }
                } else if (caja3 == 0) {
                    caja3 = nItems;
                    nuevoCliente = 3;
                    if (cola != 0) {
                        cola--;
                    }
                } else if (caja4 == 0) {
                    caja4 = nItems;
                    nuevoCliente = 4;
                    if (cola != 0) {
                        cola--;
                    }
                } else if (cola > 15 && caja5 == 0) {
                    caja5 = nItems;
                    nuevoCliente = 5;
                    if (cola != 0) {
                        cola--;
                    }
                } else if (cola > 15 && caja6 == 0) {
                    caja6 = nItems;
                    nuevoCliente = 6;
                    if (cola != 0) {
                        cola--;
                    }
                } else {
                    cola++;
                }

                // Actualizar nItems de cada caja exceptuando que haya llegado justo en ese minuto un cliente
                switch (nuevoCliente) {
                    case 1:
                        if (caja2 != 0) { caja2--; nItemsVendidos++; }
                        if (caja3 != 0) { caja3--; nItemsVendidos++; }
                        if (caja4 != 0) { caja4--; nItemsVendidos++; }
                        if (caja5 != 0) { caja5--; nItemsVendidos++; }
                        if (caja6 != 0) { caja6--; nItemsVendidos++; }
                        break;
                    case 2:
                        if (caja1 != 0) { caja1--; nItemsVendidos++; }
                        if (caja3 != 0) { caja3--; nItemsVendidos++; }
                        if (caja4 != 0) { caja4--; nItemsVendidos++; }
                        if (caja5 != 0) { caja5--; nItemsVendidos++; }
                        if (caja6 != 0) { caja6--; nItemsVendidos++; }
                        break;
                    case 3:
                        if (caja1 != 0) { caja1--; nItemsVendidos++; }
                        if (caja2 != 0) { caja2--; nItemsVendidos++; }
                        if (caja4 != 0) { caja4--; nItemsVendidos++; }
                        if (caja5 != 0) { caja5--; nItemsVendidos++; }
                        if (caja6 != 0) { caja6--; nItemsVendidos++; }
                        break;
                    case 4:
                        if (caja1 != 0) { caja1--; nItemsVendidos++; }
                        if (caja2 != 0) { caja2--; nItemsVendidos++; }
                        if (caja3 != 0) { caja3--; nItemsVendidos++; }
                        if (caja5 != 0) { caja5--; nItemsVendidos++; }
                        if (caja6 != 0) { caja6--; nItemsVendidos++; }
                        break;
                    case 5:
                        if (caja1 != 0) { caja1--; nItemsVendidos++; }
                        if (caja2 != 0) { caja2--; nItemsVendidos++; }
                        if (caja3 != 0) { caja3--; nItemsVendidos++; }
                        if (caja4 != 0) { caja4--; nItemsVendidos++; }
                        if (caja6 != 0) { caja6--; nItemsVendidos++; }
                        break;
                    case 6:
                        if (caja1 != 0) { caja1--; nItemsVendidos++; }
                        if (caja2 != 0) { caja2--; nItemsVendidos++; }
                        if (caja3 != 0) { caja3--; nItemsVendidos++; }
                        if (caja4 != 0) { caja4--; nItemsVendidos++; }
                        if (caja5 != 0) { caja5--; nItemsVendidos++; }
                        break;
                    default:
                        if (caja1 != 0) { caja1--; nItemsVendidos++; }
                        if (caja2 != 0) { caja2--; nItemsVendidos++; }
                        if (caja3 != 0) { caja3--; nItemsVendidos++; }
                        if (caja4 != 0) { caja4--; nItemsVendidos++; }
                        if (caja5 != 0) { caja5--; nItemsVendidos++; }
                        if (caja6 != 0) { caja6--; nItemsVendidos++; }
                }

                // Sumar si la gente está esperando
                if (cola == 0) {
                    minSinNadieEnCola++;
                }

                // Mientras no sea el último minuto las cajas atenderán a la persona
                if (i != minutosLaborales) {
                    if (caja1 == 1) { clientesAtendidos++; }
                    if (caja2 == 1) { clientesAtendidos++; }
                    if (caja3 == 1) { clientesAtendidos++; }
                    if (caja4 == 1) { clientesAtendidos++; }
                    if (caja5 == 1) { clientesAtendidos++; }
                    if (caja6 == 1) { clientesAtendidos++; }
                }

                // Mostrar minuto actual y si llega o no un cliente
                System.out.print(String.format("%079d", 0).replaceAll("0", "-") + "\n"
                        + "Minuto: " + i);
                if (nuevoCliente != 0) {
                    System.out.print(" - Llega 1 cliente a la caja " + nuevoCliente + " - Esperando: " + cola + "\n");
                } else {
                    System.out.print(" - No llega ningun cliente - Esperando: " + cola + "\n");
                }
                // Mostrar el estado actual de las cajas
                System.out.println(String.format("Caja 1: [%d] ", caja1)
                        + String.format("Caja 2: [%d] ", caja2)
                        + String.format("Caja 3: [%d] ", caja3)
                        + String.format("Caja 4: [%d] ", caja4)
                        + String.format("Caja 5: [%d] ", caja5)
                        + String.format("Caja 6: [%d] ", caja6));

                // Reiniciar última caja a la que llego un cliente
                nuevoCliente = 0;
            }
        }

        // Resumen del dia
        System.out.print("\n" + String.format("%079d", 0).replaceAll("0", "=") + "\n");
        System.out.printf(
                """
                        Resumen del dia:
                        Minutos sin nadie en la cola:               %4d
                        Numero de personas en la cola al finalizar: %4d
                        Numero de personas atendidas:               %4d
                        Numero de items vendidos en total:          %4d
                        """, minSinNadieEnCola, cola, clientesAtendidos, nItemsVendidos);
        System.out.print(String.format("%079d", 0).replaceAll("0", "=") + "\n");
    }
}

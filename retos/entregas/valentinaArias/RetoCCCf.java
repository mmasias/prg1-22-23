import java.util.Random;

public class supermercadoVale {

    public static void main(String[] args) {

        int tiempoTotalMinutos = 720;
        double probabilidad = 0.6;
        int tiempoTranscurrido = 0;
        int caja1, caja2, caja3, caja4;
        int cola = 0;
        caja1 = 0;
        caja2 = 0;
        caja3 = 0;
        caja4 = 0;
        
        for (int i = 0; i <= tiempoTotalMinutos; i++) {
            tiempoTranscurrido += 1;
            probabilidad = Math.random();
            Random rand = new Random();
            int items = rand.nextInt(15 - 5) + 5;
          
          
            if (probabilidad <= 0.6) {
                cola = cola + 1;
                System.out.println(">ingreso cliente ");

                if (caja1 == 0 && cola > 0) {
                    caja1 += items;
                    cola -= 1;
                    System.out.println("Pasa a la caja 1 con " + items + " Items");
                    System.out.println("Personas en cola: " + cola);

                }
                if (caja2 == 0 && cola > 0) {
                    caja2 += items;
                    cola -= 1;
                    System.out.println("Pasa a la caja 2 con " + items + " Items");
                    System.out.println("Personas en cola: " + cola);

                }
                if (caja3 == 0 && cola > 0) {
                    caja3 += items;
                    cola -= 1;
                    System.out.println("Pasa a la caja 3 con " + items + " Items");
                    System.out.println("Personas en cola: " + cola);

                }
                if (caja4 == 0 && cola > 0) {
                    caja4 += items;
                    cola -= 1;
                    System.out.println("Pasa a la caja 4 con " + items + " Items");
                    System.out.println("Personas en cola: " + cola);

                }
              
              
                System.out.println("Personas en cola: " + cola);
                System.out.println(
                        "Caja 1:[" + caja1 + "] | Caja 2:[" + caja2 + "] | Caja 3:[" + caja3 + "] | Caja 4:[" + caja4
                                + "]");
                System.out.println(
                        "---------------------------------------------------------------------------------------");

            } else {

                // System.out.println("no ingresa cliente");

            }

            // System.out.println(cola);
            if (caja1 > 0) {
                caja1 -= 1;
            }
            if (caja2 > 0) {
                caja2 -= 1;
            }
            if (caja3 > 0) {
                caja3 -= 1;
            }
            if (caja4 > 0) {
                caja4 -= 1;
            }

        }

    }

}

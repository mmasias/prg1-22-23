public class RetoCaracol {

    public static void main(String[] args) {

        int caida;
        int dia = 0;
        caida = (int) (Math.random() * 10) + 11;
        int salida;
        int nivelAgua = 20;
        boolean caracolVivo = true;

        for (salida = 0; salida < (int) caida && caracolVivo;) {
            System.out.println("----------------------------------------");
            if (dia < 10) {

                int subida = (int) (Math.random() * 4) + 1;
                caida = caida - subida;
                int bajada = (int) (Math.random() * 2);
                caida = caida + bajada;
                System.out.println("Día [" + dia + "] / Sube: [" + subida + "] / Baja: [" + bajada
                        + "] / Altura al final del día: [-" + caida + "]");

            }

            int coche = (int) (Math.random() * 100);
            if (coche >= 35) {
                System.out.println("ha aparcado un coche cerca del pozo y el caracol ha descendido 2 metros");
                caida = caida + 2;
                coche = 1;
            }

            int profAgua = (int) (Math.random() * 100);
            if (profAgua <= 15 && profAgua > 5) {
                System.out.println("ha habido una lluvia debil y el pozo se ha inundado");
                nivelAgua = nivelAgua - 2;
            }
            if (profAgua <= 5) {
                System.out.println("ha habido una lluvia fuerte y el pozo se ha inundado");
                nivelAgua = nivelAgua - 5;
            }

            if (dia >= 10 && dia < 20) {

                int subida = (int) (Math.random() * 3) + 1;
                caida = caida - subida;
                int bajada = (int) (Math.random() * 2);
                caida = caida + bajada;
                if (caida <= 0) {
                    caida = 0;
                }
                System.out.println("Día [" + dia + "] / Sube: [" + subida + "] / Baja: [" + bajada
                        + "] / Altura al final del día: [-" + caida + "]");

            }
            if (dia >= 20 && dia < 50) {
                int subida = (int) (Math.random() * 2) + 1;
                caida = caida - subida;
                int bajada = (int) (Math.random() * 2);
                caida = caida + bajada;
                if (caida <= 0) {
                    caida = 0;
                }
                System.out.println("Día [" + dia + "] / Sube: [" + subida + "] / Baja: [" + bajada
                        + "] / Altura al final del día: [-" + caida + "]");

            }
            if (dia >= 50) {
                caracolVivo = false;
                System.out.println("Día [" + dia + "] / el caracol ha muerto por inanicion");

            }

            System.out.println("----------------------------------------");

            for (int i = 0; i <= 20; i++) {

                if (i == 0) {

                    if (coche == 1) {

                        System.out.println("[__]    O-=-O     [__]");
                        coche = 0;

                    } else {
                        System.out.println("[__]              [__]");
                    }

                } else if (i >= nivelAgua) {
                    System.out.println("  []~~~~~~~~~~~~~~[] _ __ " + i);
                } else if (i == (int) caida) {
                    System.out.println("  []    _@)_/’    [] _ __ " + i);
                } else {
                    System.out.println("  []:. :. :. :. :.[] _ __ " + i);
                }

            }
            System.out.println(" [][][][][][][][][]");
            
            System.out.println("");

            if (nivelAgua <= caida) {
                caracolVivo = false;
                System.out.println("");
                System.out.println("----------------------------------------");
                System.out.println("Día [" + dia + "] / el caracol ha muerto ahogado");
                System.out.println("----------------------------------------");
                System.out.println("");
            }

            dia++;
        }

        if (caracolVivo) {
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("El caracol ha conseguido salir");
            System.out.println("----------------------------------------");
            System.out.println("");
        }
    }

}

public class RetoCaracoldavid {
    public static void main(String[] args) {
        boolean vida = true;
        double aterrizar = 0;  
        double subida = 0;
        double bajada = 0;
        double alturaTotal = 0;
        double alturaAgua = 20;
        int Dia = 0;
        aterrizar = (Math.random()*10)+10;

        while (vida == true) {
            Dia++;
            subida = (int)(Math.random()*3) + 1;
            bajada = (int)(Math.random()*2);
            alturaTotal = aterrizar - subida + bajada;
            System.out.println("Dia: [" + Dia + "] | Sube: [" + subida + "] | " + "Baja: [" + bajada + "] | " + "Altura a final del dia: [" + alturaTotal + "]");
            aterrizar=alturaTotal;
        for (int i = 0; i <= 20; i++){
            if ((int)alturaTotal == i) {
                System.out.println("[]    _@)_/’    [] _ __" + i);
            } else if (i == 0) {
                System.out.println("[__]              [__]");
            } else if (i >= (int)alturaAgua) {
                System.out.println("[]~~~~~~~~~~~~~~[] _ __" + i);
            } else {
                System.out.println("[]:. :. :. :. :.[] _ __ " + i);
            }

        }
        System.out.println("[][][][][][][][][]");
        System.out.println("");

            if (alturaTotal <= 0 || alturaAgua <= alturaTotal) {
                vida = false;
            }
        }
        if (alturaAgua <= alturaTotal) {
            System.out.println("El caracol no ha logrado salir del pozo");
        }

        if (alturaTotal <= 0) {
            System.out.println("El caracol ha logrado salir del pozo");
        }
    }
}
public class ElCaracolBase {
    public static void main(String[] args) {
        boolean vidaCaracol = true;
        double aterrizaje = 0;  
        double subida = 0;
        double bajada = 0;
        double alturaTotal = 0;
        double alturaAgua = 20;
        int contadorDia = 0;
        aterrizaje = (Math.random()*10)+10;

        while (vidaCaracol == true) {
            contadorDia++;
            subida = (int)(Math.random()*3) + 1;
            bajada = (int)(Math.random()*2);
            alturaTotal = aterrizaje - subida + bajada;
            System.out.println("Dia: [" + contadorDia + "] | Sube: [" + subida + "] | " + "Baja: [" + bajada + "] | " + "Altura al final del dia: [" + alturaTotal + "]");
            aterrizaje=alturaTotal;
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
                vidaCaracol = false;
            }
        }
        if (alturaAgua <= alturaTotal) {
            System.out.println("El caracol no logró salir del pozo");
        }

        if (alturaTotal <= 0) {
            System.out.println("El caracol logró salir del pozo");
        }
    }
}

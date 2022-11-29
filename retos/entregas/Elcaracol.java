public class Elcaracol {
    public static void main(String[] args) {
        boolean vidaCaracol = true;
        int contador = 0;
        double caida = (Math.random() * 10) + 10;
        double subida = 0;
        double bajada = 0;
        double alturaTotal = -(int) caida;
        double probabilidadCoche;

        for (int j = 1; j >= -20; j = j - 1) {
            if (j == (int) alturaTotal) {
                System.out.println("[]    _@)_/’    []" + j);
            } else if (j == 1) {
                System.out.println("[__]           [__]");

            } else if (j > alturaTotal) {
                System.out.println("[]:. :. :. :. :.[]" + j);

            } else if (j < alturaTotal) {
                System.out.println("[]~~~~~~~~~~~~~~[]" + j);

            }
        }
        while (vidaCaracol == true) {
            contador = contador + 1;
            probabilidadCoche = Math.random();
            if (contador <= 10) {
                subida = (Math.random() * 3) + 1;
                bajada = (Math.random() * 2);
                alturaTotal = alturaTotal + (int) subida - (int) bajada;
            }else if (contador>10 && contador <=20) {
                subida = (Math.random() * 3);
                bajada = (Math.random() * 2);
                alturaTotal = alturaTotal + (int) subida - (int) bajada;
            }else if (contador>20 && contador <50) {
            subida = (Math.random() * 2);
            bajada = (Math.random() * 2);
            alturaTotal = alturaTotal + (int) subida - (int) bajada;
            }
            System.out.println("Día " + contador + "El caracol subió " + subida + "m y bajó " + bajada + "m");
            if (probabilidadCoche <= 0.35){
                alturaTotal= alturaTotal-2;
            }

            for (int i = 1; i >= -20; i = i - 1) {
                if (probabilidadCoche <= 0.35 && i==1){
                    System.out.println("|      O-=-O     |");
                }
                if (i == (int) alturaTotal) {
                    System.out.println("[]    _@)_/’    []" + i);
                } else if (i == 1 &&probabilidadCoche >= 0.35) {
                    System.out.println("[__]           [__]");

                } else if (i > alturaTotal) {
                    System.out.println("[]:. :. :. :. :.[]" + i);

                } else if (i < alturaTotal) {
                    System.out.println("[]~~~~~~~~~~~~~~[]" + i);

                }

            }
            System.out.println("[][][][][][][][][]");
            

            if (alturaTotal >= 0) {
                vidaCaracol = false;
                System.out.println("El caracol conisguió salir del pozo!!!!");

            } else if (contador>=50){
                vidaCaracol= false;
                System.out.println("El caracol murió de inaciación");
            }

        }

}}

import java.util.Scanner;

public class WhacAMoleDavid {
    public static void main(String[] args) {
        int turno = 1;
        int aciertos = 0;
        int casilla = 0;
        int dimension = 4;
        int figura1 = 0;
        int figura2 = 0;
        int contador = 1;

        Scanner entrada = new Scanner(System.in);

        do {
            contador = 1;
            figura1 = (int) (Math.random() * 16) + 1;

            do {
                figura2 = (int) (Math.random() * 16) + 1;
            } while (figura1 == figura2);

            do {
                System.out.println("Golpe (entre 1 y 16):");
                casilla = entrada.nextInt();
            } while (casilla < 0 || casilla > 16);

            System.out.println("Golpe en [" + casilla + "] / Figuras en [" + figura1 + "] y [" + figura2 + "]");
            System.out.println("+-------------------+");

            for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (casilla == figura1 && casilla == contador) {
                        System.out.print(" [**] ");
                        aciertos++;
                    } else if (casilla == figura2 && casilla == contador) {
                        System.out.print(" [**] ");
                        aciertos++;
                    } else if (contador == casilla) {
                        System.out.print(" [[]] ");
                    } else if (contador == figura1 || contador == figura2) {
                        System.out.print(" [''] ");
                    } else {
                        System.out.print(" (  ) ");
                    }
                    contador++;
                }

                System.out.println();

            }

            System.out.println("+-------------------+");
            System.out.println("Turno: [" + turno + "]  /  Aciertos: [" + aciertos + "]");

            if (figura1 != casilla && figura2 != casilla) {
                System.out.println("[Fallo]");
            } else {
                System.out.println("[Acierto]");
            }

            System.out.println("=====================");
            turno++;

        } while (turno <= 16);

        System.out.println("Has acabado el juego con " + aciertos + " aciertos");

        entrada.close();
    }

}
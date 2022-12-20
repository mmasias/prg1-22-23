import java.util.Scanner;

public class WhacAMole {
     public static void main(String[] args) {
        int dimension = 4;
        int turno = 1;
        int aciertos = 0;
        int casilla = 0;
        int monigote1 = 0, monigote2=0;
        int contador = 1;

        Scanner sc = new Scanner(System.in);

        do {
            contador = 1;

            monigote1 = ((int) (Math.random() * 100) % 16) + 1;
            do {
                monigote2 = ((int) (Math.random() * 100) % 16) + 1;
            }while (monigote1==monigote2);
            do {
                System.out.println("Introzca la casilla que desea golpear");
                casilla = sc.nextInt();
            } while (casilla < 0 || casilla > 16);
            for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (casilla == monigote1 && casilla == contador) {

                        System.out.print(" [**] ");
                        aciertos++;


                    } else if (casilla == monigote2 && casilla == contador) {

                        System.out.print(" [**] ");
                        aciertos++;


                    } else if (contador == casilla) {

                        System.out.print(" [[]] ");
                    } else if (contador == monigote1 || contador==monigote2) {
                        System.out.print(" [''] ");
                    } else {
                        System.out.print(" (  ) ");
                    }
                    contador++;


                }

                System.out.println();

            }
            System.out.println("Turno: " + turno + "  /  Aciertos: " + aciertos);

            turno++;
        } while (turno <= 16);
        System.out.println("El juego ha terminado. Has tenido: " + aciertos + " aciertos");
    }

}

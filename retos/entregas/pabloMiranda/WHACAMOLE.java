import java.util.Scanner;

public class WHACAMOLE {
    public static void main(String[]args){
        int dimension = 4;
        int turno = 1;
        int acierto = 0;
        int casilla = 0;
        int monigote = 0, monigote1=0;
        int contador = 1;

        Scanner entrada =  new Scanner(System.in);

        do {
            contador = 1;

            monigote = ((int) (Math.random() * 100) % 16) + 1;
            do {
                monigote1 = ((int) (Math.random() * 100) % 16) + 1;
            }while (monigote==monigote1);
            do {
                System.out.println("Introzca la casilla que desea golpear");
                casilla = entrada.nextInt();
            } while (casilla < 0 || casilla > 16);
            for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (casilla == monigote && casilla == contador) {

                        System.out.print(" [**] ");
                        acierto++;


                    } else if (casilla == monigote1 && casilla == contador) {

                        System.out.print(" [**] ");
                        acierto++;


                    } else if (contador == casilla) {

                        System.out.print(" [[]] ");
                    } else if (contador == monigote || contador==monigote1) {
                        System.out.print(" [''] ");
                    } else {
                        System.out.print(" (  ) ");
                    }
                    contador++;


                }

                System.out.println();

            }
            System.out.println("Turno: " + turno + "  /  Aciertos: " + acierto);

            turno++;
        } while (turno <= 16);
        System.out.println("El juego ha terminado. Has tenido: " + acierto + " aciertos");
    }
}

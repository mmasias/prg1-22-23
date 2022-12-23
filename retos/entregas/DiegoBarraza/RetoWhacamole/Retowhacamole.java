import java.util.Scanner;
public class Retowhacamole {
    public static void main (String []args){
       
        int dimension=4;
        int turnos=1;
        int acierto=0;
        int casilla=0;
        int primermonigote=0;
        int segundomonigote=0;
        int contador=1;

        Scanner sc= new Scanner(System.in);
     do {
     contador = 1;

    primermonigote = ((int) (Math.random() * 100) % 16) + 1;
    do {
    segundomonigote = ((int) (Math.random() * 100) % 16) + 1;
    }while (primermonigote==segundomonigote);
     do {
      System.out.println("Que casilla quieres golpear?");
      casilla = sc.nextInt();
     } while (casilla < 0 || casilla > 16);
            for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (casilla == primermonigote && casilla == contador) {

                        System.out.print(" [**] ");
                        acierto++;


                    } else if (casilla == segundomonigote && casilla == contador) {

                        System.out.print(" [**] ");
                        acierto++;


                    } else if (contador == casilla) {

                        System.out.print(" [[]] ");
                    } else if (contador == primermonigote || contador==segundomonigote) {
                        System.out.print(" [''] ");
                    } else {
                        System.out.print(" (  ) ");
                    }
                    contador++;


                }

                System.out.println();

            }
            System.out.println("Turno: " + turnos + "  /  Aciertos: " + acierto);

            turnos++;
        } while (turnos <= 16);
        System.out.println("El juego ha terminado. Has tenido: " + acierto + " aciertos");
    }

}
            

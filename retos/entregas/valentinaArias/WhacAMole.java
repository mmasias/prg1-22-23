import java.util.Scanner;

public class WhacAMole {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int golpeJugador;
        int turnos = 0;
        int monigote;
        final String BORDE_SUPERIOR = "  +----------------------------+ ";
        final String BORDE_INFERIOR = "  +----------------------------+ ";
        String Agujero = " (  ) ";
        String AgujeroMonigote = " ('') ";
        String AgujeroGolpeado = " [[]] ";
        String AgujeroMonigoteYGolpe = " [**] ";
        String Pared = "  |  ";

        
        for (turnos = 1; turnos <= 15; turnos++) {
            monigote = 5;
            golpeJugador = entrada.nextInt();
            System.out.println(" Golpea en  [" + golpeJugador + "]/ monigote en  [" + monigote + "]");
            System.out.println(BORDE_SUPERIOR);

            for (int i = 1; i < 5; i++) {
                System.out.print(Pared);
                
                for (int j = 1; j < 5; j++) {

                    if ((i - 1) * 4 + j == monigote && (i - 1) * 4 + j == golpeJugador && monigote == golpeJugador) {
                        System.out.print(AgujeroMonigoteYGolpe);

                    } else {
                        if ((i - 1) * 4 + j == monigote) {
                            System.out.print(AgujeroMonigote);
                        }
                        if ((i - 1) * 4 + j == golpeJugador) {
                            System.out.print(AgujeroGolpeado);
                        }
                        if ((i - 1) * 4 + j != golpeJugador && (i - 1) * 4 + j != monigote) {
                            System.out.print(Agujero);
                        }
                    }

                }
                System.out.println(Pared);

            }
            System.out.println(BORDE_INFERIOR);

            System.out.println(" turno  [" + turnos + "]");

        }
    }
}

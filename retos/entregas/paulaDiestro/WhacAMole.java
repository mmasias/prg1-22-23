import java.util.Scanner;
public class WhacAMole {
    public static void main(String[] args) {
        int turnos = 1;
        int dimension = 4;
        int agujero = 0;
        int monigote = 0;   
        int golpe = 1;
        int casilla = 0;
        int aciertos = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            golpe = 1;
            agujero = (int) (Math.random() * 16) + 1;

            do {
                monigote = (int) (Math.random() * 16) + 1;
            } while (agujero == monigote);

            do {
                System.out.print("Elija a que casilla entre 1 y 16 quiere golpear: ");
                casilla = entrada.nextInt();
            } while (casilla < 0 || casilla > 16);

            System.out.println("Golpe en [" + casilla + "] | Monigote en [" + agujero + "] y [" + monigote + "]");
            System.out.println();
            System.out.println("+----------------------+");

            for (int j = 1; j <= dimension; j = j + 1) {
                for (int i = 1; i <= dimension; i = i + 1) {

                    if (casilla == agujero && casilla == golpe) {
                        System.out.print(" [**] ");
                    } else if (casilla == monigote && casilla == golpe) {
                        System.out.print(" [**] ");
                    } else if (golpe == casilla) {
                        System.out.print(" [[]] ");
                    } else if (golpe == agujero || golpe == monigote) {
                        System.out.print(" [''] ");
                    } else {
                        System.out.print(" (  ) ");
                    }
                    golpe++;
                }

                System.out.println();

            }

            System.out.println("+----------------------+");
            System.out.println();
            System.out.println("Turno: [" + turnos + "] | Aciertos: [" + aciertos + "]");

            if (agujero != casilla && monigote != casilla) {
                System.out.println("[FALLO]");
            } else {
                System.out.println("[ACIERTO]");
                aciertos=aciertos +1 ;
            }

            
            System.out.println("------------------------");
            turnos++;
        } while (turnos <= 16);
        System.out.println("Ha conseguido un total de "+ aciertos +" acierto/s");
        entrada.close();
    }

}

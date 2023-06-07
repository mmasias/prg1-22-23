import java.util.Scanner;

public class WhacAMole {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int positionMole = 0, positionMole2 = 0, lastPositionMole, lastPositionMole2, punchPosition = 0, hits = 0;

        final String Border = "----------------------------";
        final String hit = " [**] ";
        final String mole = " [''] ";
        final String punch = " [[]] ";
        final String hole = " (  ) ";
        final String Bar = "=========================================";

        System.out.println("The game begins");

        for (int turn = 1; turn <= 15; turn++) {
            lastPositionMole = positionMole;
            lastPositionMole2 = positionMole2;

            System.out.println(
                    "Punch in [" + punchPosition + "] / Moles in [" + positionMole + "] and [" + positionMole2 + "]");

            System.out.println(Border);

            for (int i = 1; i <= 16; i++) {
                if (i % 4 == 1) {
                    System.out.print("| ");
                }
                if ((i == punchPosition) && (i == positionMole || i == positionMole2)) {
                    System.out.print(hit);

                } else if (i == punchPosition) {
                    System.out.print(punch);

                } else if (i == positionMole || i == positionMole2) {
                    System.out.print(mole);
                } else {
                    System.out.print(hole);
                }
                if ((i + 1) % 4 == 1) {
                    System.out.println(" |");
                }
            }

            System.out.println(Border);
            System.out.println("Turn: [" + turn + "] / Hits: [" + hits + "]");

            if (turn != 1) {
                if (punchPosition == positionMole || punchPosition == positionMole2) {
                    System.out.println("[You hit]");
                    hits++;
                } else {
                    System.out.println("[You missed]");
                }
            }

            System.out.println(Bar);
            System.out.println("Enter the position of the punch (1 - 16): ");

            while (positionMole == lastPositionMole || positionMole == lastPositionMole2) {

                positionMole = (int) (Math.random() * 16 + 1);
                positionMole2 = (int) (Math.random() * 16 + 1);
            }

            while (positionMole == positionMole2) {
                positionMole2 = (int) (Math.random() * 16 + 1);
            }

            punchPosition = sc.nextInt();

        }

        sc.close();

    }
}

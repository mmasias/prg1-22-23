import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String hitStatus = "";
        String[] holeTypes = {"(  )", "(‘’)", "([])", "(**)"};

        int molePosition = 0;
        int playerHit = 0;
        int currentTurn = 0;
        int successfulHits = 0;
        int totalHoles = 16;
        final int MAX_TURNS = 15;

        boolean run = true;

        while (run) { 
            System.out.println("Select where to hit: (1 - " + totalHoles + ")");
            playerHit = getPlayerHit();
            molePosition = getMolePosition();

            hitStatus = getHitStatus(playerHit, molePosition);
            successfulHits =  getSuccessfulHits(hitStatus, successfulHits);

            currentTurn++;

            displayGame(playerHit, molePosition, currentTurn, successfulHits, totalHoles, hitStatus, holeTypes);

            run = getShouldGameStillRun(currentTurn, MAX_TURNS);
        }

        System.out.println("Successful hits: " + successfulHits);

    }

    public static int getPlayerHit() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getMolePosition() {
        return (int)((Math.random() * (15)) + 1);
    }

    public static String getHitStatus(int playerHit, int molePosition) {
        if (playerHit == molePosition) {
            return "Hit!";
        } else {
            return "Miss!";
        }
    }

    public static int getSuccessfulHits(String hitStatus, int successfulHits) {
        if (hitStatus == "Hit!") {
            return successfulHits += 1;
        } else {
            return successfulHits;
        }
    }

    public static boolean getShouldGameStillRun(int currentTurn, int maxTurns) {
        if (currentTurn >= maxTurns) {
            return false;
        } else {
            return true;
        }
    }

    public static void displayGame(int playerHit, int molePosition, int currentTurn, int successfulHits, int totalHoles, String hitStatus, String[] holeTypes) {
        System.out.println("Hit in [" + playerHit + "] / Mole in position [" + molePosition + "]");
        displayHoles(totalHoles, playerHit, molePosition, holeTypes);
        System.out.println("Turn: [" + currentTurn + "] / Successful Hits: [" + successfulHits + "]");
        System.out.println("[" + hitStatus + "]");
        System.out.println("================");

    }

    public static void displayHoles(int totalHoles, int playerHit, int molePosition, String[] holeTypes) {
        System.out.println("+--------------+");
        for (int i = 1; i < totalHoles + 1; i++) {
            if (i % 4 != 0) {
                System.out.print(holeTypes[getHoleType(playerHit, molePosition, molePosition)]);
            } else {
                System.out.println(holeTypes[getHoleType(playerHit, molePosition, molePosition)]);
            }
        }
        System.out.println("+--------------+");
    }

    public static int getHoleType (int playerHit, int molePosition, int i) {
        if ((playerHit == molePosition)) {
            if (playerHit == i || molePosition == i) return 3;
            else return 0;
        } else if (playerHit != molePosition) {
            if (playerHit == i) {
                return 2;
            } else if (molePosition == i) {
                return 1;
            } else {
                return 0;
            }
        } else  {
            return 0;
        }
    }
}

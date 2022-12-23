import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String hitStatus = "";
        String[] holeTypes = { "(  )", "('')", "([])", "(**)" };

        int playerHit = 0;
        int currentTurn = 0;
        int successfulHits = 0;
        int totalHoles = 16;
        int[] molePositions = { 0, 0 };
        int[] previousMolePositions = { 0, 0 };
        final int MAX_TURNS = 15;

        boolean run = true;

        while (run) {
            System.out.println("Select where to hit: (1 - " + totalHoles + ")");
            playerHit = getPlayerHit();

            getPreviousMolePositions(molePositions, previousMolePositions);
            getMolePositions(molePositions, previousMolePositions);

            hitStatus = getHitStatus(playerHit, molePositions);
            successfulHits = getSuccessfulHits(hitStatus, successfulHits);

            currentTurn++;

            displayGame(playerHit, molePositions, currentTurn, successfulHits, totalHoles, hitStatus, holeTypes);

            run = getShouldGameStillRun(currentTurn, MAX_TURNS);
        }

        System.out.println("Successful hits: " + successfulHits);

    }

    public static int getPlayerHit() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void getMolePositions(int[] molePositions, int[] previousMolePositions) {

        for (int i = 0; i < molePositions.length; i++) {
            int newMolePosition = (int) ((Math.random() * (15)) + 1);
            if (newMolePosition == previousMolePositions[i]) {
                do {
                    newMolePosition = (int) ((Math.random() * (15)) + 1);
                } while (newMolePosition == previousMolePositions[i]);
            }

            molePositions[i] = newMolePosition;
        }
    }

    public static void getPreviousMolePositions(int[] molePositions, int[] previousMolePositions) {
        for (int i = 0; i < molePositions.length; i++) {
            previousMolePositions[i] = molePositions[i];
        }
    }

    public static String getHitStatus(int playerHit, int[] molePositions) {
        for (int molePosition : molePositions) {
            if (molePosition == playerHit) {
                return "Hit!";
            }
        }
        return "Miss!";
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

    public static void displayGame(int playerHit, int[] molePositions, int currentTurn, int successfulHits,
            int totalHoles, String hitStatus, String[] holeTypes) {
        System.out.print("Hit in [" + playerHit + "] / ");
        for (int molePosition : molePositions) {
            System.out.print("Mole in position [" + molePosition + "] ");
        }
        System.out.println();
        displayHoles(totalHoles, playerHit, molePositions, holeTypes, hitStatus);
        System.out.println("Turn: [" + currentTurn + "] / Successful Hits: [" + successfulHits + "]");
        System.out.println("[" + hitStatus + "]");
        System.out.println("================");

    }

    public static void displayHoles(int totalHoles, int playerHit, int[] molePositions, String[] holeTypes,
            String hitStatus) {
        System.out.println("+--------------+");
        for (int i = 1; i < totalHoles + 1; i++) {
            if (i % 4 != 0) {
                System.out.print(holeTypes[getHoleType(playerHit, molePositions, i, hitStatus)]);
            } else {
                System.out.println(holeTypes[getHoleType(playerHit, molePositions, i, hitStatus)]);
            }
        }
        System.out.println("+--------------+");
    }

    public static int getHoleType(int playerHit, int[] molePositions, int i, String hitStatus) {
        if (hitStatus == "Miss!") {
            if (playerHit == i) {
                int PLAYER_HIT = 2;
                return PLAYER_HIT;
            } else {
                for (int molePosition : molePositions) {
                    if (molePosition == i) {
                        int MOLE = 1;
                        return MOLE;
                    }
                }
            }
            int EMPTY = 0;
            return EMPTY;
        } else {
            if (playerHit == i) {
                int WHACKED_THE_MOLE = 3;
                return WHACKED_THE_MOLE;
            }
            int EMPTY = 0;
            return EMPTY;
        }
    }
}

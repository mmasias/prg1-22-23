import java.util.Random; //Voodo

public class App {
    public static void main(String[] args) throws Exception {

        // Variable Declaration

        Random random = new Random();

        String finalMessage = "";
        final String superiorWellBorder = "[][]            [][]";
        final String wellWall = "  [].:.:.:.:.:.:[]  ";
        final String inferiorWellBorder = "  [][][][][][][][]  ";
        final String snailInWell = "  []   _@)_/'   []  ";
        final String waterWellWall = "  []~~~~~~~~~~~~[]  ";

        int daysPassed = 0;
        int waterDepth = 0;
        int snailAscendanceDuringDay = 0;
        int snailDescendanceDuringNight;
        int snailTotalMovement;
        int snailDepth = -(random.nextInt(11) + 10); // Formula for random numbers = minValue + rn.nextInt(maxValue -
                                                     // minValue + 1)
        final int totalDepth = -20;

        double carPassingProbability = 0.35;
        double carPassingDice;
        double heavyRainProbability = 0.05;
        double lightRainProbability = 0.15;
        double rainDice;

        boolean isSnailOutside = false;
        boolean isSnailDead = false;
        boolean aCarPassed = false;
        boolean itRained = false;

        System.out.println("--------------------------------------------------");
        System.out.println("A poor snail falls " + ((snailDepth * -1) + 1) + " meters into a well.");
        System.out.println("--------------------------------------------------");

        // Code Logic
        while (!isSnailOutside && !isSnailDead) {

            daysPassed++;

            carPassingDice = random.nextDouble();
            if (carPassingDice <= carPassingProbability) {
                snailDepth -= 2;
                aCarPassed = true;
            }

            rainDice = random.nextDouble();
            if (rainDice < heavyRainProbability) {
                waterDepth += 5;
                itRained = true;
            } else if (rainDice > heavyRainProbability && rainDice < lightRainProbability) {
                waterDepth += 2;
                itRained = true;
            }

            // Snail movement logic
            if (daysPassed <= 10) {
                snailAscendanceDuringDay = random.nextInt(4) + 1;
            } else if (daysPassed <= 20) {
                snailAscendanceDuringDay = random.nextInt(3) + 1;
            } else if (daysPassed <= 50) {
                snailAscendanceDuringDay = random.nextInt(2) + 1;
            }

            if (snailDepth < (totalDepth + waterDepth)) {
                snailDepth = (totalDepth + waterDepth) + 1;
            }

            snailDescendanceDuringNight = random.nextInt(2);
            snailTotalMovement = snailAscendanceDuringDay - snailDescendanceDuringNight;
            snailDepth += snailTotalMovement;

            if (snailDepth > 0) {
                isSnailOutside = true;
            }

            if (daysPassed > 50) {
                isSnailDead = true;
            }

            // Print Logic
            System.out.println("Day: " + daysPassed);
            if (!isSnailOutside) {
                // Daily Summary
                if (aCarPassed) {
                    System.out.println("A car passed, throwing the snail down by 2 meters!");
                }
                if (itRained) {
                    System.out.println("It rains, the well is flooded by " + waterDepth + " meters");
                }
                System.out.println("Snail Went Up By: " + snailAscendanceDuringDay);
                System.out.println("Snail Went Down By: " + snailDescendanceDuringNight);
                System.out.println("Snail's Total Movement was: " + snailTotalMovement);
                System.out.println("Snail's depth at the end of the day: " + ((snailDepth * -1) + 1));
                System.out.println("--------------------------------------------------");
            }
            // Well painting
            System.out.println(superiorWellBorder);
            for (int depth = 0; depth > totalDepth; depth--) {
                if (depth == snailDepth) {
                    System.out.println(snailInWell + "__" + ((depth * -1) + 1));
                } else {
                    if (depth <= totalDepth + waterDepth) {
                        System.out.println(waterWellWall + "__" + ((depth * -1) + 1));
                    } else {
                        System.out.println(wellWall + "__" + ((depth * -1) + 1));
                    }
                }
            }
            System.out.println(inferiorWellBorder);
            System.out.println("--------------------------------------------------");

            if (aCarPassed) {
                aCarPassed = false;
            }
            if (itRained) {
                itRained = false;
            }
        }

        if (isSnailOutside) {
            finalMessage = "The snail got out after " + daysPassed + " days!";
        } else if (isSnailDead) {
            finalMessage = "After " + daysPassed + " days, the snail died of exhaustion";
        }

        System.out.println(finalMessage);
    }
}

public class TheSnail {
    public static void main(String[] args) throws Exception {

        String endMessage = "";
        final String superiorBorder = "[][]            [][]";
        final String wall = "  [].:.:.:.:.:.:[]  ";
        final String inferiorBorder = "  [][][][][][][][]  ";
        final String snail = "  []   _@)_/'   []  ";
        final String water = "  []~~~~~~~~~~~~[]  ";

        int daysPassed = 0, waterDepth = 0, snailUpDay = 0, snailDownNight, snailTotalMovement,
                snailDepth = (int) ((Math.random() * 10) + 1);

        final int totalDepth = -20;

        double carProbability = 0.35, heavyRainProbability = 0.05, lightRainProbability = 0.15;

        boolean snailOut = false, snailDeath = false, carPassed = false, itRained = false;

        System.out.println("--------------------------------------------------");
        System.out.println("The snail falls " + ((snailDepth * -1) + 1) + " meters into a well.");
        System.out.println("--------------------------------------------------");

        while (!snailOut && !snailDeath) {

            daysPassed++;

            double carDice = Math.random();

            if (carDice <= carProbability) {

                snailDepth -= 2;
                carPassed = true;

            }

            double rainDice = Math.random();

            if (rainDice <= heavyRainProbability) {

                waterDepth += 5;
                itRained = true;

            } else if (rainDice > heavyRainProbability && rainDice < lightRainProbability) {

                waterDepth += 2;
                itRained = true;
            }

            if (daysPassed <= 10) {

                snailUpDay = (int) (Math.random() * 4) + 1;

            } else if (daysPassed <= 20) {

                snailUpDay = (int) (Math.random() * 3) + 1;

            } else if (daysPassed <= 50) {

                snailUpDay = (int) (Math.random() * 2) + 1;

            }

            if (snailDepth < (totalDepth + waterDepth)) {

                snailDepth = (totalDepth + waterDepth) + 1;

            }

            snailDownNight = (int) (Math.random() * 2) + 1;

            snailTotalMovement = snailUpDay - snailDownNight;

            snailDepth += snailTotalMovement;

            if (snailDepth > 0) {

                snailOut = true;

            }

            if (daysPassed > 50) {

                snailDeath = true;

            }

            System.out.println("Day " + daysPassed);

            if (!snailOut) {

                if (carPassed) {

                    System.out.println("A car passed by and the snail fell 2 meters.");

                }

                if (itRained) {

                    System.out.println("It rained and the well filled with water up to " + waterDepth + " meters.");

                }

                System.out.println("Snail climbed " + snailUpDay + " meters and fell " + snailDownNight + " meters.");
                System.out.println("Snail's total movement was " + snailTotalMovement + " meters.");
                System.out.println("Snail's depth at the end of the day is " + ((snailDepth * -1) + 1) + " meters.");
                System.out.println("---------------------------------------------------------");

            }

            System.out.println(superiorBorder);
            for (int depth = 0; depth > totalDepth; depth--) {
                if (depth == snailDepth) {
                    System.out.println(snail + "__" + ((depth * -1) + 1));
                } else {
                    if (depth <= (totalDepth + waterDepth)) {
                        System.out.println(water + "__" + ((depth * -1) + 1));
                    } else {
                        System.out.println(wall + "__" + ((depth * -1) + 1));
                    }
                }

            }

            System.out.println(inferiorBorder);
            System.out.println("---------------------------------------------------------");

            if (carPassed) {

                carPassed = false;

            }

            if (itRained) {

                itRained = false;

            }

        }

        if(snailOut) {

            endMessage = "The snail got out of the well in " + daysPassed + " days.";

        } else if (snailDeath) {

            endMessage = "The snail died in " + daysPassed + " days.";

        }

        System.out.println(endMessage);

    }
}

public class ArteASCIIFor {
    public static void main(String[] args) {

        System.out.println("Reto 1:");
        for (int i = 0; i <= 5; i++) {
            String t = ("**********");
            System.out.println(t);

        }

        System.out.println();
        System.out.println("Reto 2:");
        for (int i = 0; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                String t = (i % 2 == 0 ? "**  **  **" : "  **  **  ");
                System.out.println(t);
            }
        }

        System.out.println();
        System.out.println("Reto 3:");
        String t = ("+--------------------+");
        System.out.println(t);
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 2; j++) {
                t = (i % 2 == 0 ? "|**  **  **  **  **  |" : "|  **  **  **  **  **|");
                System.out.println(t);
            }
        }
        t = ("+--------------------+");
        System.out.println(t);

        System.out.println();
        System.out.println("Reto 4:");
        t = "    *";
        System.out.println(t);
        for (int i = 1; i <= 3; i++) {
            t = t.substring(1);
            t = t + "**";
            System.out.println(t);
        }
        System.out.println("********");
        for (int i = 0; i <= 4; i++) {
            t = "*********";
            System.out.println(t);
        }

        System.out.println();
        System.out.println("Reto 5:");
        t = "    *";
        System.out.println(t);
        for (int i = 1; i <= 3; i++) {
            t = t.substring(1);
            t = t + "**";
            System.out.println(t);
        }
        System.out.println("********");
        for (int i = 3; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                if (i % 2 == 0) {
                    t = "***   ***";
                    System.out.println(t);
                } else {
                    t = "*********";
                    System.out.println(t);
                }
            }
        }
    }
}
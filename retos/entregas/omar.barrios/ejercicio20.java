public class ejercicio20 {
    public static void main(String[] args) {
        int b = 5;
        for (int i = 1; i <= 21; i = i + 1) {
            for (int j = 1; j <= 21; j = j + 1) {
                if (j == b - 1) {
                    System.out.print("[*]");
                    b = b + 4;
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
            b = b - 21;
        }
    }
}

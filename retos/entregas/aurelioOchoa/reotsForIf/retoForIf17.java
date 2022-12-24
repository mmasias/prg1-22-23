public class retoForIf17 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int y = 1; y <= dimension; y = y + 1) {
            for (int x = 1; x <= dimension; x = x + 1) {
                
                if (
                x == 2 && y != 1 && y != 21 ||
                x == 20 && y != 1 && y != 21 ||
                y == 2 && x != 1 && x != 21 ||
                y == 20 && x != 1 && x != 21
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}
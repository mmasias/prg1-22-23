public class retoForIf16 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int y = 1; y <= dimension; y = y + 1) {
            for (int x = 1; x <= dimension; x = x + 1) {
                
                if (
                y != 1 && y != 21 && x != 1 && x != 21 
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
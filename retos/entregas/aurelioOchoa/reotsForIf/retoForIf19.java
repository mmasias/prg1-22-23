public class retoForIf19 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int y = 1; y <= dimension; y = y + 1) {
            for (int x = 1; x <= dimension; x = x + 1) {
                
                if (
                    (x + y) % 2 == 0    
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
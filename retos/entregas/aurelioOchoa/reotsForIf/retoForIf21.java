public class retoForIf21 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int y = 1; y <= dimension; y = y + 1) {
            for (int x = 1; x <= dimension; x = x + 1) {
                
                if (
                    x == x &&
                    (y!=6 || x!=11) &&
                    (y!=7 || x!=9) &&
                    (y!=7 || x!=10) &&
                    (y!=7 || x!=12) &&
                    (y!=7 || x!=13) && 
                    (y!=8 || x!=8) &&
                    (y!=8 || x!=14) &&
                    (y!=9 || x!=7) &&
                    (y!=10 || x!=7) &&
                    (y!=9 || x!=15) &&
                    (y!=10 || x!=15) &&
                    (y!=11 || x!=6) &&
                    (y!=11 || x!=16) &&
                    (y!=12 || x!=7) &&
                    (y!=13 || x!=7) &&
                    (y!=12 || x!=15) &&
                    (y!=13 || x!=15) &&
                    (y!=14 || x!=8) &&
                    (y!=14 || x!=14) &&
                    (y!=15 || x!=9) &&
                    (y!=15 || x!=10) &&
                    (y!=15 || x!=12) &&
                    (y!=15 || x!=13) &&
                    (y!=16 || x!=11)
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
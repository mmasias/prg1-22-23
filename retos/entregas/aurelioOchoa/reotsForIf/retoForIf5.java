public class retoForIf5 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int y = 1; y <= dimension; y = y + 1) {
            for (int x = 1; x <= dimension; x = x + 1) {

                if (
                    x==11 && y==11
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
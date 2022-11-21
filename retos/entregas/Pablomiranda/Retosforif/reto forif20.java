public class RetoForif20 {

    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int i = 1; i <= dimension; i = i + 1) {
            for (int j = 1; j <= dimension; j = j + 1) {

                if ((i + j) % 4 == 1) {
                    System.out.print("(*)");

                } else {
                    System.out.print(" . ");
                }

            }
            System.out.println();
        }
    }
}
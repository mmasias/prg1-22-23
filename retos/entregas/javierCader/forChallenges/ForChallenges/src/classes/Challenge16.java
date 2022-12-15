package classes;

public class Challenge16 {
    public Challenge16() {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if ((i > 1 && i < dimension) && (j > 1 && j < dimension)) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }
}
package classes;

public class Challenge17 {
    public Challenge17() {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if ((i > 1 && i < dimension) && (j > 1 && j < dimension) && !((i > 2 && i < dimension - 1) && (j > 2 && j < dimension - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }
}
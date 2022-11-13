package classes;

public class Challenge13 {
    public Challenge13() {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (i == j + 1) {
                    System.out.print("*");
                } else if (i + 1 == j) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }
}
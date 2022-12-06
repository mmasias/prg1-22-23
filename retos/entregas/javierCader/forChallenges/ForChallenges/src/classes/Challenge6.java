package classes;

public class Challenge6 {
    public Challenge6() {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (i == 11 && j != 11) {
                    System.out.print("*");
                } else if (j == 11) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }
}
package classes;

public class Challenge1 {
    public Challenge1() {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                    i==2
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

    }
}
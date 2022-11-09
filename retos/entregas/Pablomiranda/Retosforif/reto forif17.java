class RetoForIf17 {

    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int i = 1; i <= dimension; i = i + 1) {
            for (int j = 1; j <= dimension; j = j + 1) {

                if ((i == 2 || i == 20) &&
                        (j != 1 && j != 21)
                        ||
                        (j == 2 || j == 20) &&
                                (i != 1 && i != 21)

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
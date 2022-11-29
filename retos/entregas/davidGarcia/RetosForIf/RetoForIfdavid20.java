public class RetoForIfdavid20 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                i + j == 5 || i + j == 9 || i + j == 13 || i + j == 17 || i + j == 21 || i + j == 25 || i + j == 29 || i + j == 33 || i + j == 37 || i + j == 41
                // El código hasta aquí
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
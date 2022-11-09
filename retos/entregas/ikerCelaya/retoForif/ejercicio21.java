public class ejercicio21 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                (i == 6 || i == 16) && j == 11 || 
                (i == 7 || i == 15) && (j == 9 ||j == 10 ||j == 12 ||j == 13) || 
                (i == 8 || i == 14) && (j == 8 || j == 14) || 
                (i == 9 || i == 10 || i == 12 || i == 13) && (j == 7 || j == 15) ||
                i == 11 && (j == 6 || j == 16) 
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

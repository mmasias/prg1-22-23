public class reto4 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j ++) {
            for (int i = 1; i <= dimension; i ++) {

                if (
                // El código desde aqui
                    8 <= i && i<= 14
                // El código hasta aquí
                ) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}
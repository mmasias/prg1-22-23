public class retoforif19 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        System.out.println("Ejercicio 19:");
        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    (( i %2 == 0 ) && (j %2 == 0 )) || ((i %2 != 0 ) && ( j %2 != 0 ))
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
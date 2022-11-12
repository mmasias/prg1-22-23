public class retoforif21 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        System.out.println("Ejercicio 21:");
        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    (( j - 11 ) * ( j - 11 ) + ( i - 11 ) * ( i - 11 ) <= 5 * 5 ) && !(( j - 11 ) * ( j - 11 ) + ( i - 11 ) * ( i - 11 ) <= 4 * 4  ) 
                    && ! (( i == 8 && j == 7 ) || ( i == 7 && j == 8 ) || ( i == 14 && j == 7 ) || ( i == 7 && j == 14 ) || ( i == 15 && j == 8 ) || ( i == 8 && j == 15 ) || ( i == 15 && j == 8 ) || ( i == 8 && j == 15 ) || (i==14 && j==15) || (i==15 && j==14))
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
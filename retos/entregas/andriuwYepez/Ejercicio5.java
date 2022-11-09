public class Ejercicio5 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        int i;
        int j;


        System.out.println("Ejercicio 5:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                    i == 11 && j == 11
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
public class Ejercicio7 {

    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        int i;
        int j;


        System.out.println("Ejercicio 7:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                    i == j
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
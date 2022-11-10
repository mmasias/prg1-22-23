public class retoFor9 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        System.out.println("Ejercicio 9");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                
                    i==dimension-j +1 || i==j
                
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

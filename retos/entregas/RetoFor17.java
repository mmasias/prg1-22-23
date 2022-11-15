public class retoFor17 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        System.out.println("Ejercicio 17");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                
                    i>19&&i<21||j>19&&j<21||i>1&&i<3||j>1&&j<3
                
                
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

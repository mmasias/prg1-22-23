public class retoFor16 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        System.out.println("Ejercicio 16");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                
                    i>1 && j>1 && i<21 && j<21
                
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

public class retoFor18{
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        System.out.println("Ejercicio 18");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                
                    i<6&&j<6
                
                
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

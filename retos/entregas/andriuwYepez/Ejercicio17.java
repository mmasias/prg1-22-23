public class Ejercicio17 {
    
    
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        int i;
        int j;

        System.out.println("Ejercicio 17:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                    (( i >= 2 && i <= 20 ) && ( j >= 2 && j <= 20 )) && !(( i >= 3 && i <= 19 ) && (j>=3 && j<=19))
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
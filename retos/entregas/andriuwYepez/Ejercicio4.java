public class Ejercicio4 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        int i;
        int j;

// Eejrcicio 4 malo 
    
        System.out.println("Ejercicio 4:");
        for (j = 1; j <= dimension; j = j + 1) {
            for (i = 1; i <= dimension; i = i + 1) {

                if (
                    i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
        }
    }
}
public class retoFor20 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        System.out.println("Ejercicio 20");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                
                    i==dimension-j||i==dimension-j-4||i==dimension-j-8||i==dimension-j-12||i==dimension-j-16||i==dimension-j-20||i==dimension-j+4||i==dimension-j+4||i==dimension-j+8||i==dimension-j+12||i==dimension-j+16||i==dimension-j+20
                
                
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

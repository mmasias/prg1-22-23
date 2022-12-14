public class reto20 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==dimension-j+20 ||
                    i==dimension-j+16 ||
                    i==dimension-j+12 ||
                    i==dimension-j+8 ||
                    i==dimension-j+4 ||
                    i==dimension-j ||
                    i==dimension-j-4 ||
                    i==dimension-j-8 ||
                    i==dimension-j-12 ||
                    i==dimension-j-16 
                // El código hasta aquí
                ) {
                    System.out.print(" # ");
                } else{
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}

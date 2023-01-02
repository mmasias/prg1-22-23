public class RetoForIf18 {
    public static void main(String[] args){
        int dimension;
        dimension = 21;
        System.out.println("\n");
        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i>=1 && j>=1 && !(i>=6 || j>=6)
                // El código hasta aquí
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

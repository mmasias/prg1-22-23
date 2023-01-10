public class retoFor21 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        System.out.println("Ejercicio 19");

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                
                    (j!=6 || i!=11) && (j!=7 || i!=9 && i!=13) && (j!=7 || i!=10 && i!=12) && (j!=8 || i!=8 && i!=14) && (j!=9 || i!=7 && i!=15) && (j!=9 || i!=7 && i!=15) && (j!=10 || i!=7 && i!=15) && (j!=11 || i!=6 && i!=16) && (j!=12 || i!=7 && i!=15) && (j!=13 || i!=7 && i!=15) && (j!=14 || i!=8 && i!=14) && (j!=15 || i!=9 && i!=13) && (j!=15 || i!=10 && i!=12) && (j!=16 || i!=11)
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

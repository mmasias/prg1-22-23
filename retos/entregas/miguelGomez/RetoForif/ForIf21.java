public class ForIf21 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            System.out.println();
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
              (i !=6 || j != 11) 
              && (i!=7 || (j<=8 || j == 11 || j>=14) ) 
              && (i !=16 || j != 11) 
              && (i!=15 || (j<=8 || j == 11 || j>=14))
              && (j !=6 || i != 11) 
              && (j!=7 || (i<=8 || i == 11 || i>=14) ) 
              && (j !=16 || i != 11) 
              && (j!=15 || (i<=8 || i == 11 || i>=14))
              && (j !=8 || i != 8)
              && (j !=8 || i != 14)
              && (j !=14 || i != 8)
              && (j !=14 || i != 14)
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
package RetoForIf;
public class Reto20 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    (i==5-j) || (i== 9-j) || (i==13-j) || (i==17-j) || (i==21-j) || (i==25-j) || (i==29-j) || (i==33-j) || (i==37-j) || (i==41-j) || (i==45-j)
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
public class RetoForIf18 {
    
    public static void main(String[] args) {
    int dimension;
    dimension = 21;

    for (int j = 1; j <= dimension; j = j + 1) {
        for (int i = 1; i <= dimension; i = i + 1) {

            if (
                1<=i && 5>=i && 1<=j && 5>=j
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

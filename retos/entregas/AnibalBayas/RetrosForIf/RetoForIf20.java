public class RetoForIf20 {
    public static void main(String[] args) {
        int dimension;
         dimension = 21;
 
         for (int j = 1; j <= dimension; j = j + 1) {
             for (int i = 1; i <= dimension; i = i + 1) {
 
                 if (
                    i==21-j && j==21-i || i==17-j && j==17-i || i==13-j && j==13-i || i==9-j && j==9-i || i==5-j && j==5-i || i==25-j && j==25-i
                    || i==29-j && j==29-i || i==33-j && j==33-i || i==37-j && j==37-i || i==41-j && j==41-i
                    
                      
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

public class RetoForIf19 {
    public static void main(String[] args) {
        int dimension;
         dimension = 21;
 
         for (int j = 1; j <= dimension; j = j + 1) {
             for (int i = 1; i <= dimension; i = i + 1) {
 
                 if (
                     i== j  || j==i || i== j +2 || j==i || i== j +4 || j==i || i== j +6 || j==i || i== j +8 || j==i || i== j +10 || j==i
                     || i== j +12 || j==i || i== j +14 || j==i || i== j +16 || j==i || i== j +18 || j==i || i== j +20 || j==i || i== j -2 || j==i
                     || i== j -4 || j==i || i== j -6 || j==i || i== j -8 || j==i || i== j -10 || j==i || i== j -12 || j==i || i== j -14 || j==i
                     || i== j -16 || j==i || i== j -18 || j==i || i== j -20 || j==i
                      
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

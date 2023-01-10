public class retoFor19 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                    
                i==j||i==j+2||i==j+4||i==j+6||i==j+8||i==j+10||i==j+12||i==j+14||i==j+16||i==j+18||i==j+20||i==j||i==j-2||i==j-4||i==j-6||i==j-8||i==j-10||i==j-12||i==j-14||i==j-16||i==j-18||i==j-20
                
                
                
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

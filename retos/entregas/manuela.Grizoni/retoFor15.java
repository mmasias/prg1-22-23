public class retoFor15 {
    public static void main (String[] args) {
      
            int dimension;
            dimension=21;
    
            for (int j = 1; j <= dimension; j = j+1){
                for (int i = 1; i <= dimension; i = i+1){
    
                    if ((i >= 2 && i <= 5) && (j >= 1) || (j >= 2 && j <= 5) && (i >=1)) {
    
                        System.out.print("[*]");
    
                    }else {
                        System.out.print("( )");
                    }
                }
                System.out.println(); 
            }
    }
    
}

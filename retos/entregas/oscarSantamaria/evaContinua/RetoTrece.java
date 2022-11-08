public class EvaContinua {
 public static void main(String[] args){
       
        int profundidad = 21;
        
        
        for (int i=1; i<=21; i= i+1){
            for (int j=1; j<=21; j=j+1){
                if(i==1 & j==2){
                    System.out.print("  / ");
                }else{if(i==i+1 & j==j+1){
                    System.out.print("  / ");
                }else{ if(i==2 & j==1){
                    System.out.print("  / ");
                }else{if(i==i+1 & j==j+1){
                    System.out.print("  / ");
                }else{
                    System.out.print(" [] ");
                }

                }
                    
                }
                    
                }
                

        } 
        System.out.println("");
        }
        
     }
    
}

   //System.out.print(" [] ");
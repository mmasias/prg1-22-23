public class retoCaracol {
    public static void main(String[] args) {
        int dimension=21;
        int subida=0; 
        int bajada=0; 
        int dias =0;
        int altura=(int)(Math.random() * (20-10+1))+ 10;
        
     do {   
        System.out.println();
        System.out.println("Día "+ (dias) );

        if(dias>0){
            subida = (int)(Math.random() * (4-1+1))+ 1;
            bajada = (int)(Math.random() * (2-0+1))+ 0;
            altura = (altura+bajada) - subida;
            
            if (altura>=dimension){
                altura=dimension-1;
            }
    
            System.out.print("Ha subido "+ subida + " metro/s |");
            System.out.print(" Ha bajado "+ bajada + " metro/s |");
            System.out.println(" Su altura actual es "+altura);
            System.out.println(" ");
    
            }

        for (int j = 0; j <= dimension; j = j + 1) 

            if (j==0) {
                 if (j==0 && altura<=0){
                    System.out.println("[__]   _@)_/’      [__]");
                 }
                   else{ 
                    System.out.println("[__]              [__]");
            } 
            
            }
            else if (j==altura){
                System.out.println("  []    _@)_/’    [] _ __"+ (j));
            }
            else if(j==dimension){
                System.out.println("  [][][][][][][][][]");
            }

            else {
                System.out.println("  []:. :. :. :. :.[] _ __" +(j));
            }  
            System.out.println();
            System.out.println("--------------------------------------------");

        dias ++;

        }while (altura>=1 && dias<=50);
    }
}

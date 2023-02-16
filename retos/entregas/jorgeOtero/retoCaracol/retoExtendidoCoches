public class Caracol {
    public static void main(String[] args) {
        int dimension=21, suelo=21, techo=0;
        int altura=(int)(Math.random() * (20-10+1))+ 10;
        int coche=0;
        int subir=0; 
        int bajar=0; 
        int contadorDias =0;

     do {   

        System.out.println("DÍA "+ (contadorDias) );

        
        if(contadorDias>0){

            if (contadorDias<=10){
                subir = (int)(Math.random() * (4-1+1))+ 1;
            }
            else if(contadorDias<=20){
                subir = (int)(Math.random() * (3-1+1))+ 1;
            }
            else if(contadorDias<=50){
                subir = (int)(Math.random() * (2-1+1))+ 1;
            }
            coche=(int) Math.random() * 101;

            bajar = (int)(Math.random() * (2-0+1))+ 0;

            if(coche>=65){

                bajar=bajar+2;
            }

            altura = (altura+bajar) - subir;

            if (altura>=suelo){
                altura=suelo-1;
            }
    
            System.out.print("Ha subido "+ subir + " metro/s __");
            System.out.println("__Ha bajado "+ bajar + " metro/s");
            System.out.println("");
    
            }

        for (int j = 0; j <= dimension; j = j + 1) 


            if (j==0) {
                 if (j==0 && altura<=techo){
                    System.out.println("[__]   _@)_/’      [__] _  __ SOY LIBRE");
                 }
                 else if(coche >= 65){
                    System.out.println("[__]    O-=-O     [__]");
                 }
                   else{ 
                    System.out.println("[__]              [__]");
            } 
            
            }
            else if (j==altura){
                System.out.println("  []    _@)_/’    [] _ __"+ (j));
            }
            else if(j==suelo){
                System.out.println("  [][][][][][][][][]");
            }

            else {
                System.out.println("  []:. :. :. :. :.[] _ __" +(j));
            }  
            System.out.println();

        contadorDias ++;

        }while (altura>=1 && contadorDias<=50);

    if(contadorDias>=50){
        System.out.println("Nuestro amigo el Caracol se ha muerto");
    }

    }
}

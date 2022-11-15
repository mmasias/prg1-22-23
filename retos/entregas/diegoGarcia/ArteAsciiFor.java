import javax.sound.sampled.SourceDataLine;

public class ArteAsciiFor {
    
    public  static void main(String [] args){

        System.out.println("\n");
        System.out.println("Escribir los miniretos Ascii con bucles for");
        System.out.println();

        System.out.println("EJERCICIO 1");

        for(int i=1; i <= 5; i++){
            System.out.println("**********");
        }
        System.out.println();

        
        System.out.println("EJERCICIO 2");

        for ( int i = 1; i <= 5; i++){
            System.out.println("**  **  **");

            if ((i == 2)||(i == 3)){

                for (int j = 1; j <= 2; j++){
                    System.out.println("  **  **  ");
                }
                i++;
            }

        }

        System.out.println();

        System.out.println("EJERCICIO 3");
        
        System.out.println("+--------------------+");
        for(int i = 1; i <= 2; i++ ){
            
            System.out.println("|**  **  **  **  **  |");
            System.out.println("|**  **  **  **  **  |");
            System.out.println("|  **  **  **  **  **|");
            System.out.println("|  **  **  **  **  **|");

        }
        System.out.println("+--------------------+");

        System.out.println();

        System.out.println("EJERCICIO 4");

        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("********");

        for(int i = 1; i <= 5; i++){
            System.out.println("*********");
        }

        System.out.println();

        System.out.println("EJERCICIO 5");

        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("********");
        for(int i = 1; i <= 6; i++){
            
            if((i == 1)||(i == 2)||(i == 3)){
                System.out.println("*********");
            }else if (i == 6){
                System.out.println("*********");
            }else{
                System.out.println("***   ***");
            }

        }
    }
}

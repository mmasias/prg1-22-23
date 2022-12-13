import java.util.Scanner;
public class RetoCCCF {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
    int caja1=0;
    int caja2=0;
    int caja3=0;
    int caja4=0;
    int cola=0;
    int colaCero = 0;
    int totalItems = 0; 
    int colaTotal = 0;
    int objetos = 0;
    double cliente;
        boolean compra=false;
        for (int minuto=1; minuto <=12; minuto++){

          cliente=(Math.random());
          System.out.println ("Minuto " + minuto);
          
          //llega un cliente
         
          if (cliente<=0.4) {
            System.out.println("Llega una persona");
            cola = cola + 1;
            colaTotal = colaTotal + 1;
            } else {
                System.out.println(" - No llega nadie");
            }
            if (cola == 0) {
                colaCero = colaCero + 1;
            }
            
        } 
        // Caja 1
        if (caja1 == 0 && cola > 0) {

       cola = cola - 1;
       //compra
       objetos = (int) ((Math.random() * (15 - 5)) + 5);
       //recuento compra
       caja1 = objetos;
      } else if (caja1 > 0) {
        caja1 = caja1 - 1;
    } 
    
    // Caja 2
    if (caja2 == 0 && cola > 0) {
        cola = cola - 1;
        // Calculo de compra de la persona que entra
        objetos = (int) ((Math.random() * (15 - 5)) + 5);
        // cuenta compra total
        caja2 = objetos;
        

    } else if (caja2 > 0) {
        caja2 = caja2 - 1;
    } 
    // Caja 3
    if (caja3 == 0 && cola > 0) {
        cola = cola - 1;
        // Calculo de compra de la persona que entra
        objetos = (int) ((Math.random() * (15 - 5)) + 5);
        // cuenta compra total
        caja3 = objetos;

 }else if (caja3 > 0) {
    caja3 = caja3 - 1;
}
      // Caja 4
             if (caja4 == 0 && cola > 0) {
                cola = cola - 1;
                // Calculo de objetos de la persona que entra
                objetos = (int) ((Math.random() * (15 - 5)) + 5);
                // cuenta objetos totales
                
     caja4 = objetos;
     

    } else if (caja4 > 0) {
        caja4 = caja4 - 1;
    }        
         // Cola
    System.out.println(" Esperando: " + cola);
    System.out.println("  Caja 1:[" + caja1 + "]");
    System.out.println("  Caja 2:[" + caja2 + "]");
    System.out.println("  Caja 3:[" + caja3 + "]");
    System.out.println("  Caja 4:[" + caja4 + "]");
    System.out.println("----------------------------------------");
    String input=entrada.nextLine();
     
   }  

}

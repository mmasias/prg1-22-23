package Colas;
import java.util.Scanner;

public class colasSergioMayenGrafico {
    public static void main(String[] args){
        Scanner siguiente = new Scanner(System.in);

        int tiempo = 0, productosEnCaja1 = 0, productosEnCaja2 = 0, productosEnCaja3 = 0, productosEnCaja4 = 0, enCola = 0, caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0, personasAtendidas = 0, productosVendidos = 0;
        double probabilidadEntradaNuevo;
            
        while(tiempo < 20){
            tiempo = tiempo +1;

            productosEnCaja1 = 15;

            for(int c1 = 0; c1 < productosEnCaja1; c1 ++ ){
                System.out.print("_O_");
            }if(productosEnCaja1 > 0){
                for(int c1 = productosEnCaja1 - 1; c1 == 0; c1--){
                    System.out.print("_-_");
                }
            }

            System.out.println("Tiempo "+ tiempo + " minutos");
            siguiente.nextLine();
        }
    }
}

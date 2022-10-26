import java.util.Scanner;

public class Moneda {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Indice del juego de la moneda
        System.out.println("#####################################################");
        System.out.println("Vamos a jugar al juego de la moneda, elige una opcion");
        System.out.println("#####################################################");
        System.out.println("1| Cara  ");
        System.out.println("2| Cruz  ");
        System.out.println("#####################################################");
        int ladoElegido = sc.nextInt();
        
        
        //Se lanza la moneda
        System.out.println("Se lanza la moneda y ...");

        int moneda = (int) (Math.random() * 10) ;
        
        //Para cuando el número sea menor igual a 5 es CARA y si es mayor a 5 es CRUZ
        if (moneda <= 5 && ladoElegido == 1){
            System.out.println("Ha salido cara, ganaste");
        } else if (moneda > 5 && ladoElegido == 2){
            System.out.println("Ha salido cruz, ganaste");
        } else if (moneda <= 5 && ladoElegido == 2){
            System.out.println("Ha salido cara, perdiste");
        } else if (moneda > 5 && ladoElegido == 1){
            System.out.println("Ha salido cruz, perdiste");
        } else {
            System.out.println("No te he entendido, prueba otra vez");
        }
        
        

    }
}

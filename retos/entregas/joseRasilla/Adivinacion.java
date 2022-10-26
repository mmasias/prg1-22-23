import java.util.Scanner;

public class Adivinacion {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        int presente;

        System.out.println("Responda con 0 para No y 1 para Si");
        
        //Tarjeta 1
        System.out.println("Se encuentra su numero en la primera tarjeta:");
        presente = entrada.nextInt();
        if(presente == 1){
            numero += 1;
        }
        //Tarjeta 2
        System.out.println("Se encuentra su numero en la segunda tarjeta:");
        presente = entrada.nextInt();
        if(presente == 1){
            numero += 2;
        }
        //Tarjeta 3
        System.out.println("Se encuentra su numero en la tercera tarjeta:");
        presente = entrada.nextInt();
        if(presente == 1){
            numero += 4;
        }
        //Tarjeta 4
        System.out.println("Se encuentra su numero en la cuarta tarjeta:");
        presente = entrada.nextInt();
        if(presente == 1){
            numero += 8;
        }
        //Tarjeta 5
        System.out.println("Se encuentra su numero en la quinta tarjeta:");
        presente = entrada.nextInt();
        if(presente == 1){
            numero += 16;
        }
        //Tarjeta 6
        System.out.println("Se encuentra su numero en la sexta tarjeta:");
        presente = entrada.nextInt();
        if(presente == 1){
            numero += 32;
        }
        //Tarjeta 7
        System.out.println("Se encuentra su numero en la septima tarjeta:");
        presente = entrada.nextInt();
        if(presente == 1){
            numero += 64;
        }
        
        System.out.println("Su numero es " + numero);

    }
}

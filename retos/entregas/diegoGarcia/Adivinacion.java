
import java.util.Scanner;

public class Adivinacion {
    public static void main(String [] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Elija un numero del 1 al 99, COMENCEMOS.");
        System.out.println("\n");

        int respuestaUsuario;
        int sumaNumeros = 0;

        System.out.print("¿El numero se encuentra el la targeta numero 1? ");
        respuestaUsuario = s.nextInt();

        if (respuestaUsuario == 1){
            sumaNumeros+=1;
        }else if((respuestaUsuario != 1) || ((respuestaUsuario != 0))){
            System.out.println("Este valor es incorrecto pero lo supondre como un NO");
        }

        System.out.println();
        System.out.print("¿El numero se encuentra el la targeta numero 2? ");
        respuestaUsuario = s.nextInt();

        if (respuestaUsuario == 1){
            sumaNumeros+=2;
        }else if((respuestaUsuario !=1)||(respuestaUsuario !=0)){
            System.out.println("Este valor es incorrecto pero lo supondre como un NO");
        }

        System.out.println();
        System.out.print("¿El numero se encuentra el la targeta numero 3? ");
        respuestaUsuario = s.nextInt();

        if (respuestaUsuario == 1){
            sumaNumeros+=4;
        }else if((respuestaUsuario !=1)||(respuestaUsuario !=0)){
            System.out.println("Este valor es incorrecto pero lo supondre como un NO");
        }

        System.out.println();
        System.out.print("¿El numero se encuentra el la targeta numero 4? ");
        respuestaUsuario = s.nextInt();

        if (respuestaUsuario == 1){
            sumaNumeros+=8;
        }else if((respuestaUsuario !=1)||(respuestaUsuario !=0)){
            System.out.println("Este valor es incorrecto pero lo supondre como un NO");
        }

        System.out.println();
        System.out.print("¿El numero se encuentra el la targeta numero 5? ");
        respuestaUsuario = s.nextInt();

        if (respuestaUsuario == 1){
            sumaNumeros+=16;
        }else if((respuestaUsuario !=1)||(respuestaUsuario !=0)){
            System.out.println("Este valor es incorrecto pero lo supondre como un NO");
        }

        System.out.println();
        System.out.print("¿El numero se encuentra el la targeta numero 6? ");
        respuestaUsuario = s.nextInt();

        if (respuestaUsuario == 1){
            sumaNumeros+=32;
        }else if((respuestaUsuario !=1)||(respuestaUsuario !=0)){
            System.out.println("Este valor es incorrecto pero lo supondre como un NO");
        }

        System.out.println();
        System.out.print("¿El numero se encuentra el la targeta numero 7? ");
        respuestaUsuario = s.nextInt();

        if (respuestaUsuario == 1){
            sumaNumeros+=64;
        }else if((respuestaUsuario !=1)||(respuestaUsuario !=0)){
            System.out.println("Este valor es incorrecto pero lo supondre como un NO");
        }

        System.out.println("\n");
        if (sumaNumeros > 99){
            System.out.println("Usted esta haciendo trampas no me ha dicho bien las tablas");
        }else {
            System.out.println("El numero en el que usted estaba pensando es el numero "+ sumaNumeros);
        }
        System.out.println("\n");

        s.close();
    }
}

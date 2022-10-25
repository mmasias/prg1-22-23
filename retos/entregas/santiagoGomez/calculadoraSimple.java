package intervencionUsuario;
import java.util.Scanner;

public class calculadora{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //calculadora
        System.out.println("Dime dos números");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double suma = num1+num2;
        double resta = num1-num2;
        double dividir = num1/num2;
        double multiplicar = num1*num2;


        //funcionamiento
        System.out.println("+---------------------------------------------------------------------------+");
        System.out.println("Que operacion quieres hacer?");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("1| suma");
        System.out.println("2| resta");
        System.out.println("3| dividir (aquí se dividirá el primer número que pusiste con el segundo)");
        System.out.println("4| multiplicar");
        System.out.println("+---------------------------------------------------------------------------+");
        int operacion = sc.nextInt();

        //operaciones 
        if (operacion == 1){
            System.out.println("El resultado es: "+suma);
        } else if (operacion == 2){
            System.out.println("El resultado es: "+resta);
        } else if (operacion == 3){
            System.out.println("El resultado es: "+dividir);
        }else if (operacion == 4){
            System.out.println("El resultado es: "+multiplicar);
        } else {
            System.out.println("No te he entendido, recuerda poner la operacion como sale exactamente");
        }


    }





}

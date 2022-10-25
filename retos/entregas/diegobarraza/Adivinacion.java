import java.util.Scanner;
public class adivinanumero {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        int numerousuario;
        int calculodenumeros=0;

        System.out.println("Empecemos,tienes que elegir un numero de los que estan en estas cartas");

        System.out.println("El numero se encuentra en la tarjeta numero 1?");
        numerousuario= sc.nextInt();

        if(numerousuario ==1){ 
            calculodenumeros+=1;
        }else if(numerousuario==0){
            calculodenumeros+=0;
        }

        System.out.println("El numero se encuentra en la tarjeta numero 2?");
        numerousuario= sc.nextInt();

        if(numerousuario==1){ 
            calculodenumeros+=2;
        }else if(numerousuario==0){
            calculodenumeros+=0;
        }

        System.out.println("El numero se encuentra en la tarjeta numero 3?");
        numerousuario= sc.nextInt();

        if(numerousuario ==1){ 
            calculodenumeros+=4;
        }else if(numerousuario==0){
            calculodenumeros+=0;
        }

        System.out.println("El numero se encuentra en la tarjeta numero 4?");
        numerousuario= sc.nextInt();
    
         if(numerousuario==1){ 
             calculodenumeros+=8;
        }else if(numerousuario==0){
            calculodenumeros+=0;
        }

        System.out.println("El numero se encuentra en la tarjeta numero 5?");
        numerousuario= sc.nextInt();
    
         if(numerousuario ==1){ 
             calculodenumeros+=16;
        }else if(numerousuario==0){
            calculodenumeros+=0;
        }

        System.out.println("El numero se encuentra en la tarjeta numero 6?");
        numerousuario= sc.nextInt();
    
         if(numerousuario ==1){ 
             calculodenumeros+=32;
        }else if(numerousuario==0){
            calculodenumeros+=0;
        }

        System.out.println("El numero se encuentra en la tarjeta numero 7?");
        numerousuario=sc.nextInt();

        if(numerousuario ==1){ 
            calculodenumeros+=64;
        }else if(numerousuario==0){
            calculodenumeros+=0;
        }
        System.out.println();
        if (calculodenumeros>99){
            System.out.println("Se tiene que escoger un numero del 1 al 99,seguir las instrucciones");
        }else {
            System.out.println("El numero que estas pensando es "+calculodenumeros);
        }
        System.out.println(); 
        sc.close();
    }
}
